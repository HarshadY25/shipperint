package com.GS.shipperIntegration.Service;

import com.GS.shipperIntegration.Models.*;
import com.GS.shipperIntegration.EntityModels.OrderPlacementResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.GS.shipperIntegration.Models.TrackOrderResponse.EachShipment;
import com.GS.shipperIntegration.Models.NDRResponse.NdrResponse;
import com.GS.shipperIntegration.Utils.IndiaStateCodes;
public class FedExImpl {
    // TO DO: Add AWB

//    @Autowired
    private RestTemplate restTemplate = new RestTemplate();

    private AccountNumber accountNumber = new AccountNumber("767870477");

    private static final Logger logger = LoggerFactory.getLogger(FedExImpl.class);

    public OrderPlacementResponse fedExOrderPlacementResponse (PlaceOrderRequest placeOrderRequest, String orgId) throws IOException {
        OrderPlacementResponse orderPlacementResponse = new OrderPlacementResponse();
        FedExCreateShipmentResponse fedExFwdResponse = fedExCreateShipment(placeOrderRequest);
        String shipperStatus = null;
        if (fedExFwdResponse.getErrors() == null) {
            if (fedExFwdResponse.getResponseStatus() == 200) {
                shipperStatus = "Success";
                String awb = fedExFwdResponse.getOutput().getTransactionShipments().get(0).getMasterTrackingNumber();
                placeOrderRequest.setAwb(awb);
                orderPlacementResponse.setAwbNumber(awb);
                orderPlacementResponse.setLabelUrl(fedExFwdResponse.getOutput().getTransactionShipments().get(0).getPieceResponses().get(0).getPackageDocuments().get(0).getUrl());
            }
            else if (fedExFwdResponse.getResponseStatus() == 400) {
                logger.info(fedExFwdResponse.getErrors().get(0).getMessage());
                shipperStatus = "Bad Request - Invalid format";
            }else if (fedExFwdResponse.getResponseStatus() == 401) {
                logger.info(fedExFwdResponse.getErrors().get(0).getMessage());
                shipperStatus = "Unauthorized for FedEx";
            }else if (fedExFwdResponse.getResponseStatus() == 403) {
                logger.info(fedExFwdResponse.getErrors().get(0).getMessage());
                shipperStatus = "Forbidden";
            }else if (fedExFwdResponse.getResponseStatus() == 404) {
                logger.info(fedExFwdResponse.getErrors().get(0).getMessage());
                shipperStatus = "Resource not Found";
            }else if (fedExFwdResponse.getResponseStatus() == 500) {
                logger.info(fedExFwdResponse.getErrors().get(0).getMessage());
                shipperStatus = "Service failure";
            }else if (fedExFwdResponse.getResponseStatus() == 503) {
                logger.info(fedExFwdResponse.getErrors().get(0).getMessage());
                shipperStatus = "Service unavailable";
            }
        } else {
            logger.info("FedEx order creation failed due to: " + fedExFwdResponse.getErrors().get(0).getMessage());
        }
        orderPlacementResponse.setShipperStatus(shipperStatus);
        return orderPlacementResponse;
    }

    public FedExCreateShipmentResponse fedExCreateShipment (PlaceOrderRequest placeOrderRequest) throws IOException {
        FedExCreateShipmentResponse fedExCreateShipmentResponse = new FedExCreateShipmentResponse();
        String bearerToken = generateTokenFedEx();
        ResponseEntity<FedExCreateShipmentResponse> FedExResponseEntity = null;
        FedExCreateShipmentRequestBody fedExRequestBody = getCreateShipmentRequestBody(placeOrderRequest);

        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add("Authorization", "Bearer " + bearerToken);

        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String json = mapper.writeValueAsString(fedExRequestBody);

        String url = "https://apis.fedex.com/ship/v1/shipments";

        logger.info("json : " + json.toString());


        HttpEntity<String> entity = new HttpEntity<>(json, httpHeaders);

        logger.info("entity : " + entity.toString());
        int responseStatus = 0;

        try {
            long inTime = System.currentTimeMillis();
            FedExResponseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, FedExCreateShipmentResponse.class);
            responseStatus = FedExResponseEntity.getStatusCodeValue();
            long outTime = System.currentTimeMillis();
            logger.info("Latency of Rest : " + (outTime - inTime));

        } catch (Exception e) {
            logger.info("Order Placement of FedEX failed Due to " + e.toString());
            //SfxForwardResponse sfxForwardResponse = new SfxForwardResponse();
//            fedExCreateShipmentResponse.setMessage("Order Placement of sfx failed Due to " + e.toString());
//            fedExCreateShipmentResponse.setMessage("Failed");
            logger.info(fedExCreateShipmentResponse.toString());
            return fedExCreateShipmentResponse;
        }

        fedExCreateShipmentResponse = FedExResponseEntity.getBody();
        fedExCreateShipmentResponse.setResponseStatus(responseStatus);
        return fedExCreateShipmentResponse;
    }

    public NDRResponse initiateRTO (ArrayList<String> awbs, OrderPlacementResponse shipmentDetails) throws JsonProcessingException {
        NDRResponse ndrResponse = new NDRResponse();
        for (String awb : awbs) {

            FedExCancelShipmentResponse response = fedExCancelShipment(awb);

            if (!response.getOutput().getSuccessMessage().equalsIgnoreCase("Success")) {

                //To do : Logic to handle AWB's if Shipment Fails
                return ndrResponse;
            }
        }
        ArrayList<NdrResponse> ndrResponseList = new ArrayList<>();
        if (!shipmentDetails.isPickedFormWareHouse()) {

            for (String  eachAwb : awbs) {
                NdrResponse eachNdr = new NdrResponse();
                eachNdr.setAwbNumber(eachAwb);
                eachNdr.setMessage("Test Passed");
                eachNdr.setCode("200");
                eachNdr.setShipperId(1);
                ndrResponseList.add(eachNdr);

            }
            ndrResponse.setNDRResponse(ndrResponseList);
        } else {
            for (String awb : awbs) {
                FedExCancelShipmentResponse response = fedExCancelShipment(awb);
                if (response != null) {
                    NdrResponse eachNdr = new NdrResponse();
                    eachNdr.setAwbNumber(awb);
                    eachNdr.setMessage(response.getOutput().getSuccessMessage());
                    eachNdr.setCode("200");
                    eachNdr.setShipperId(4);
                    ndrResponseList.add(eachNdr);
                }
            }
            ndrResponse.setNDRResponse(ndrResponseList);
        }

        return ndrResponse;

    }

    public  ArrayList<EachShipment> orderTrackingFwd(ArrayList<String> awbs) throws Exception {


        ArrayList<EachShipment> allTracked = new ArrayList<TrackOrderResponse.EachShipment>();
        if (awbs.size() > 30) {
            ArrayList<String> awbFirst30 = null;
            for (int i = 0; i < 30; i++) {
                awbFirst30.set(i, awbs.get(i));
            }
            awbs = awbFirst30;
        }
        FedExTrackingResponse trackingResponse = fedExTrackByTrackingNo(awbs);
        logger.info("FedEx Track Order Response " + trackingResponse.toString());

        if( trackingResponse != null && (trackingResponse.getResponseStatus() == 200)) {
            for (CompleteTrackResults trackResult : trackingResponse.getOutput().getCompleteTrackResults()) {

                String awb = trackResult.getTrackingNumber();
//                ArrayList<TrackResults> trackResults = trackingResponse.getOutput().getCompleteTrackResults().get(0).getTrackResults();
                ArrayList<ScanEvent> scanEvents = trackResult.getTrackResults().get(0).getScanEvents();

                for (ScanEvent scanEvent : scanEvents) {
                    EachShipment trackOrderResponse = new EachShipment();

                    trackOrderResponse.setShipperStatus(scanEvent.getDerivedStatus());
                    trackOrderResponse.setIsSuccess(true);
                    String shipmentLocation = "";
                    for (String streetLine : scanEvent.getScanLocation().getLocationContactAndAddress().getAddress().getStreetLines()) {
                        shipmentLocation = shipmentLocation + ", " + streetLine;
                    }
                    shipmentLocation += scanEvent.getScanLocation().getLocationContactAndAddress().getAddress().getCity();
                    trackOrderResponse.setShipmentLocation(shipmentLocation);
                    trackOrderResponse.setShipperId(4);
                    trackOrderResponse.setRemark(scanEvent.getEventDescription());
                    trackOrderResponse.setAwb(awb);
                    // TO DO: set GS mapped status
//                    trackOrderResponse.setShipmentStatus();
                    //Setting rider_name and rider_contact
//                    if (deliveyRequestStateHistory.getRider_contact() != null ) {
//                        trackOrderResponse.setRider_contact(deliveyRequestStateHistory.getRider_contact());
//                    }
//                    if (deliveyRequestStateHistory.getRider_name() != null) {
//                        trackOrderResponse.setRider_name(deliveyRequestStateHistory.getRider_name());
//                    }
                    String dateTime = scanEvent.getDate();
                    DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime localDateTime = LocalDateTime.from(formatDateTime.parse(dateTime));
                    Timestamp ts = Timestamp.valueOf(localDateTime);
                    trackOrderResponse.setModifiedDate(ts);
                    allTracked.add(trackOrderResponse);
                }
            }
        }
        else {
        EachShipment trackOrderResponse = new EachShipment();

        trackOrderResponse.setIsSuccess(false);
        trackOrderResponse.setMessage(trackingResponse.getErrors().get(0).getMessage());
        trackOrderResponse.setShipperId(4);
        allTracked.add(trackOrderResponse);
        }
        return allTracked;
    }


    public FedExCancelShipmentResponse fedExCancelShipment (String awb) throws JsonMappingException, JsonProcessingException {
        FedExCancelShipmentResponse cancelShipmentResponse = new FedExCancelShipmentResponse();
        String bearerToken = generateTokenFedEx();
        ResponseEntity<FedExCancelShipmentResponse> FedExResponseEntity = null;
        FedExCancelShipmentRequest fedExRequestBody = getCancelShipmentRequestBody(awb);
        // TO DO: set tracking number as awb
//        fedExRequestBody.setTrackingNumber();
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add("Authorization", "Bearer " + bearerToken);

        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = mapper.writeValueAsString(fedExRequestBody);

        String url = "https://apis.fedex.com/ship/v1/shipments/cancel";

        logger.info("json : " + json.toString());


        HttpEntity<String> entity = new HttpEntity<>(json, httpHeaders);

        logger.info("entity : " + entity.toString());
        int responseStatus = 0;

        try {
            long inTime = System.currentTimeMillis();
            FedExResponseEntity = restTemplate.exchange(url, HttpMethod.PUT, entity, FedExCancelShipmentResponse.class);
            responseStatus = FedExResponseEntity.getStatusCodeValue();
            long outTime = System.currentTimeMillis();
            logger.info("Latency of Rest : " + (outTime - inTime));

        } catch (Exception e) {
            logger.info("Order Placement of FedEx failed Due to " + e.toString());
            //SfxForwardResponse sfxForwardResponse = new SfxForwardResponse();
//            cancelShipmentResponse.setMessage("Order Placement of sfx failed Due to " + e.toString());
//            cancelShipmentResponse.setMessage("Failed");
            logger.info(cancelShipmentResponse.toString());
            return cancelShipmentResponse;
        }
        cancelShipmentResponse.setResponseStatus(responseStatus);
        cancelShipmentResponse = FedExResponseEntity.getBody();
        return cancelShipmentResponse;

    }

    //    @CrossOrigin(origins = "*", allowedHeaders = "*")
//    @PostMapping("/token")
    public FedExTrackingResponse fedExTrackByTrackingNo (ArrayList<String> awb) throws JsonMappingException, JsonProcessingException {
        FedExTrackingResponse trackingResponse = new FedExTrackingResponse();
        String bearerToken = generateTokenFedEx();
        ResponseEntity<FedExTrackingResponse> FedExResponseEntity = null;
        //TO DO: Dynamic tracking number
//        String trackingNumber = "794635747468";
        FedExTrackingRequest trackingRequest = getTrackingRequestBody(awb, false);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + bearerToken);
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = mapper.writeValueAsString(trackingRequest);

        String url = "https://apis-sandbox.fedex.com/track/v1/trackingnumbers";

        logger.info("json : " + json.toString());


        HttpEntity<String> entity = new HttpEntity<>(json, httpHeaders);

        logger.info("entity : " + entity.toString());
        int responseStatus = 0;

        try {
            long inTime = System.currentTimeMillis();
            FedExResponseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, FedExTrackingResponse.class);
            responseStatus = FedExResponseEntity.getStatusCodeValue();
            long outTime = System.currentTimeMillis();
            logger.info("Latency of Rest : " + (outTime - inTime));

        } catch (Exception e) {
            logger.info("Order Tracking of FedEx failed Due to " + e.toString());
            //SfxForwardResponse sfxForwardResponse = new SfxForwardResponse();
//            cancelShipmentResponse.setMessage("Order Placement of sfx failed Due to " + e.toString());
//            cancelShipmentResponse.setMessage("Failed");
            logger.info(trackingResponse.toString());
            return trackingResponse;
        }

        trackingResponse.setResponseStatus(responseStatus);
        return trackingResponse;

    }
    //    @CrossOrigin(origins = "*", allowedHeaders = "*")
    //    @PostMapping("/token")
    public String generateTokenFedEx() throws JsonMappingException, JsonProcessingException {
        FedExAuthRequest request = new FedExAuthRequest();

        ObjectMapper mapper = new ObjectMapper();

        ResponseEntity<FedExAuthResponse> fedExResponseEntity = null;

        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("grant_type", "client_credentials");
        map.add("client_id", "l7598868b668f04944b1a66ca50b632d84");
        map.add("client_secret", "dca8ab4412224cf3bec60799f2dffb97");

        HttpEntity<MultiValueMap<String, String>> requestForm = new HttpEntity<MultiValueMap<String, String>>(map, httpHeaders);

        String url = "https://apis.fedex.com/oauth/token";

        logger.info("requestData : " + map.toString());
    //        HttpEntity<String> entity = new HttpEntity<>(requestJson, httpHeaders);
    //        HttpEntity<JSONObject> entity = new HttpEntity<>(rjson, httpHeaders);
        logger.info("entity : " + requestForm.toString());
        try {
            long inTime = System.currentTimeMillis();
            fedExResponseEntity = restTemplate.exchange(url, HttpMethod.POST, requestForm, FedExAuthResponse.class);
            long outTime = System.currentTimeMillis();
            logger.info("Latency of Rest : " + (outTime - inTime));
            logger.info(fedExResponseEntity.getBody() + "");
        } catch (Exception e) {
            logger.info("Token Generation of fedEx failed Due to " + e.toString());
            return "Failed";
        }
    //        FedExAuthResponse fed = mapper.readValue(fedExResponseEntity.getBody(), FedExAuthResponse.class);
        return fedExResponseEntity.getBody().getAccess_token();
    }

    public FedExCancelShipmentRequest getCancelShipmentRequestBody (String trackingNumber) {
        FedExCancelShipmentRequest cancelShipmentRequest = new FedExCancelShipmentRequest();
        //Setting the Account Number
        cancelShipmentRequest.setAccountNumber(accountNumber);
        //Setting the Tracking Number
        cancelShipmentRequest.setTrackingNumber(trackingNumber);
        return cancelShipmentRequest;
    }
    public FedExCreateShipmentRequestBody getCreateShipmentRequestBody (PlaceOrderRequest placeOrderRequest) throws IOException {
        FedExCreateShipmentRequestBody requestBody = new FedExCreateShipmentRequestBody();
        //Setting FedEx Account Number
        requestBody.setAccountNumber(accountNumber);
        //Creating RequestedShipment Body for RequestBody
        RequestedShipment requestedShipment = createRequestedShipment(placeOrderRequest);
        requestBody.setRequestedShipment(requestedShipment);
        requestBody.setLabelResponseOptions("URL_ONLY");
        return requestBody;
    }
    public FedExTrackingRequest getTrackingRequestBody (ArrayList<String> awbs, boolean includeDetailedScans) {
        FedExTrackingRequest trackingRequest = new FedExTrackingRequest();
        trackingRequest.setIncludeDetailedScans(includeDetailedScans);
//        TrackingInfo trackingInfo = new TrackingInfo(new TrackingNumberInfo(trackingNumber));
        ArrayList<TrackingInfo> trackingInfos = new ArrayList<>();
        for (String awb : awbs) {
            trackingInfos.add(new TrackingInfo(new TrackingNumberInfo(awb)));
        }
//        trackingInfos.add(trackingInfo);
        trackingRequest.setTrackingInfo(trackingInfos);
        return trackingRequest;
    }
    public RequestedShipment createRequestedShipment(PlaceOrderRequest placeOrderRequest) throws IOException {
        RequestedShipment requestedShipment = new RequestedShipment();
        PersonalDetails shipperDetails = placeOrderRequest.getPickupDetails();
        PersonalDetails recipientDetails = placeOrderRequest.getShippingDetails();
        Party shipper = new Party();
        Party recipient = new Party();
        ArrayList<Party> recipients = new ArrayList<>();
        // SHIPPER DETAILS
        Address shipperAddress = new Address();
        ArrayList<String> streetLines = new ArrayList<>();
        List<String> addressListS = new ArrayList<String>(Arrays.asList(shipperDetails.getAddress().split(",")));
        String currString = "";
        for (String addressString : addressListS) {
            if (streetLines.size() == 3) {
                break;
            }
            if ((currString + addressString).length() < 35) {
                currString = currString + addressString;
            } else {
                streetLines.add(currString);
                currString = "";
            }
        }
        shipperAddress.setStreetLines(streetLines);
        shipperAddress.setCity(shipperDetails.getCity());
        shipperAddress.setPostalCode(shipperDetails.getPinCode());
        shipperAddress.setStateOrProvinceCode(IndiaStateCodes.getStateCodes().get(shipperDetails.getState()));
        shipperAddress.setCountryCode("IN");    //Setting Country code of INDIA
        shipper.setAddress(shipperAddress);
        Contact shipperContact = new Contact();
        shipperContact.setPersonName(shipperDetails.getName());
        shipperContact.setPhoneNumber(shipperDetails.getMsisdn());
        shipper.setContact(shipperContact);

        // RECIPIENT DETAILS
        Address recipientAddress = new Address();
        ArrayList<String> streetLines1 = new ArrayList<>();
        List<String> addressListR = new ArrayList<String>(Arrays.asList(recipientDetails.getAddress().split(",")));
        currString = "";
        for (String addressString : addressListR) {
            if (streetLines1.size() == 3) {
                break;
            }
            if ((currString + addressString).length() < 35) {
                currString = currString + addressString;
            } else {
                streetLines1.add(currString);
                currString = "";
            }
        }
        recipientAddress.setStreetLines(streetLines1);
        recipientAddress.setCity(recipientDetails.getCity());
        recipientAddress.setPostalCode(recipientDetails.getPinCode());
        recipientAddress.setStateOrProvinceCode(IndiaStateCodes.getStateCodes().get(recipientDetails.getState()));
        recipientAddress.setCountryCode("IN");    //Setting Country code of INDIA
        recipient.setAddress(recipientAddress);
        Contact recipientContact = new Contact();
        recipientContact.setPersonName(recipientDetails.getName());
        recipientContact.setPhoneNumber(recipientDetails.getMsisdn());
        recipient.setContact(recipientContact);
        recipients.add(recipient);

        //ADDING WEIGHT OF SHIPMENTS
        Weight shipmentWeight = new Weight();
        shipmentWeight.setUnits("KG");
        double totalWeight = 0;
        for (OrderDetails subOrder : placeOrderRequest.getSubOrderdetail()) {
            totalWeight += subOrder.getDeadWeight();
        }
        shipmentWeight.setValue(totalWeight/1000);
        ArrayList<RequestedPackageLineItems> requestedPackageLineItems = new ArrayList<>();
        requestedPackageLineItems.add(new RequestedPackageLineItems(shipmentWeight));

        requestedShipment.setRequestedPackageLineItems(requestedPackageLineItems);
        requestedShipment.setShipper(shipper);
        requestedShipment.setRecipients(recipients);
//        requestedShipment.setPickupType("USE_SCHEDULED_PICKUP");
//        requestedShipment.setServiceType("FEDEX_GROUND");
//        requestedShipment.setPackagingType("FEDEX_BOX");

        // Adding shippingChargesPayment
        ResponsibleParty responsibleParty = new ResponsibleParty();
        Payor payor = new Payor();
        responsibleParty.setAccountNumber(accountNumber);
        payor.setResponsibleParty(responsibleParty);
        ShippingChargesPayment shippingChargesPayment = new ShippingChargesPayment();
        shippingChargesPayment.setPayor(payor);
        requestedShipment.setShippingChargesPayment(shippingChargesPayment);
        // Adding labelSpecification
        requestedShipment.setLabelSpecification(new LabelSpecification("PDF", "PAPER_4X6"));
        // Adding customsClearanceDetail
        CustomsClearanceDetail customsClearanceDetail = new CustomsClearanceDetail();
        customsClearanceDetail.setIsDocumentOnly(false);
        customsClearanceDetail.setIsDocumentOnly(false);
        customsClearanceDetail.setDutiesPayment(new DutiesPayment("SENDER"));
        customsClearanceDetail.setCommercialInvoice(new CommercialInvoice("SOLD"));
        ArrayList<Commodities> commoditiesArrayList = new ArrayList<>();
        for (OrderDetails orderDetails : placeOrderRequest.getSubOrderdetail()) {
            Commodities commodities = new Commodities();
            commodities.setDescription(orderDetails.getProductName());
            commodities.setCountryOfManufacture("IN");
            double deadWeight = orderDetails.getDeadWeight()/1000;
            commodities.setWeight(new Weight("KG", deadWeight));
            commodities.setQuantity(orderDetails.getQuantity());
            commodities.setQuantityUnits("EA");
            commodities.setUnitPrice(new UnitPrice(Float.parseFloat(orderDetails.getProductPrice()), "INR"));
            commodities.setCustomsValue(new CustomsValue(1, "INR"));
            commoditiesArrayList.add(commodities);
        }
        customsClearanceDetail.setCommodities(commoditiesArrayList);
        requestedShipment.setCustomsClearanceDetail(customsClearanceDetail);
        return requestedShipment;
    }

}
