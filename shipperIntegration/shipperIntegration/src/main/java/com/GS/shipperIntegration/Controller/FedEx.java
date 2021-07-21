//package com.Growsimplee.shipperIntegration.shipperIntegration.Controller;
//
//import com.Growsimplee.shipperIntegration.shipperIntegration.Models.*;
//import com.Growsimplee.shipperIntegration.shipperIntegration.Service.FedExImpl;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.client.RestTemplate;
//
//import java.io.IOException;
//
//@RestController
//public class FedEx {
//    private static final Logger logger = LoggerFactory.getLogger(FedEx.class);
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private FedExImpl fedExImpl;
//
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
//    @PostMapping("/token")
//    public FedExCreateShipmentResponse fedExCreateShipment (@RequestBody PlaceOrderRequest placeOrderRequest) throws IOException {
//        FedExCreateShipmentResponse fedExCreateShipmentResponse = new FedExCreateShipmentResponse();
//        String bearerToken = fedExImpl.generateTokenFedEx();
//        ResponseEntity<FedExCreateShipmentResponse> FedExResponseEntity = null;
//        FedExCreateShipmentRequestBody fedExRequestBody = fedExImpl.getCreateShipmentRequestBody(placeOrderRequest);
//
//        HttpHeaders httpHeaders = new HttpHeaders();
//
//        httpHeaders.add("Authorization", "Bearer " + bearerToken);
//
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        String json = mapper.writeValueAsString(fedExRequestBody);
//
//        String url = "https://apis.fedex.com/ship/v1/shipments";
//
//        logger.info("json : " + json.toString());
//
//
//        HttpEntity<String> entity = new HttpEntity<>(json, httpHeaders);
//
//        logger.info("entity : " + entity.toString());
//
//
//        try {
//            long inTime = System.currentTimeMillis();
//            FedExResponseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, FedExCreateShipmentResponse.class);
//            long outTime = System.currentTimeMillis();
//            logger.info("Latency of Rest : " + (outTime - inTime));
//
//        } catch (Exception e) {
//            logger.info("Order Placement of FedEX failed Due to " + e.toString());
//            //SfxForwardResponse sfxForwardResponse = new SfxForwardResponse();
////            fedExCreateShipmentResponse.setMessage("Order Placement of sfx failed Due to " + e.toString());
////            fedExCreateShipmentResponse.setMessage("Failed");
//            logger.info(fedExCreateShipmentResponse.toString());
//            return fedExCreateShipmentResponse;
//        }
//
//        return FedExResponseEntity.getBody();
//    }
//
//    //    @CrossOrigin(origins = "*", allowedHeaders = "*")
////    @PostMapping("/token")
//    public FedExCancelShipmentResponse fedExCancelShipment (PlaceOrderRequest placeOrderRequest) throws JsonMappingException, JsonProcessingException {
//        FedExCancelShipmentResponse cancelShipmentResponse = new FedExCancelShipmentResponse();
//        String bearerToken = fedExImpl.generateTokenFedEx();
//        ResponseEntity<FedExCancelShipmentResponse> FedExResponseEntity = null;
//        FedExCancelShipmentRequest fedExRequestBody = fedExImpl.getCancelShipmentRequestBody(placeOrderRequest);
//        // TO DO: set tracking number as awb
//        fedExRequestBody.setTrackingNumber("794877901474");
//        HttpHeaders httpHeaders = new HttpHeaders();
//
//        httpHeaders.add("Authorization", "Bearer " + bearerToken);
//
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//        String json = mapper.writeValueAsString(fedExRequestBody);
//
//        String url = "https://apis.fedex.com/ship/v1/shipments/cancel";
//
//        logger.info("json : " + json.toString());
//
//
//        HttpEntity<String> entity = new HttpEntity<>(json, httpHeaders);
//
//        logger.info("entity : " + entity.toString());
//
//
//        try {
//            long inTime = System.currentTimeMillis();
//            FedExResponseEntity = restTemplate.exchange(url, HttpMethod.PUT, entity, FedExCancelShipmentResponse.class);
//            long outTime = System.currentTimeMillis();
//            logger.info("Latency of Rest : " + (outTime - inTime));
//
//        } catch (Exception e) {
//            logger.info("Order Placement of FedEx failed Due to " + e.toString());
//            //SfxForwardResponse sfxForwardResponse = new SfxForwardResponse();
////            cancelShipmentResponse.setMessage("Order Placement of sfx failed Due to " + e.toString());
////            cancelShipmentResponse.setMessage("Failed");
//            logger.info(cancelShipmentResponse.toString());
//            return cancelShipmentResponse;
//        }
//
//        return FedExResponseEntity.getBody();
//
//    }
//
////    @CrossOrigin(origins = "*", allowedHeaders = "*")
////    @PostMapping("/token")
//    public FedExTrackingResponse fedExTrackByTrackingNo (PlaceOrderRequest placeOrderRequest) throws JsonMappingException, JsonProcessingException {
//        FedExTrackingResponse trackingResponse = new FedExTrackingResponse();
//        String bearerToken = fedExImpl.generateTokenFedEx();
//        ResponseEntity<FedExTrackingResponse> FedExResponseEntity = null;
//        //TO DO: Dynamic tracking number
//        String trackingNumber = "794635747468";
//        FedExTrackingRequest trackingRequest = fedExImpl.getTrackingRequestBody(trackingNumber, false);
//
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("Authorization", "Bearer " + bearerToken);
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//        String json = mapper.writeValueAsString(trackingRequest);
//
//        String url = "https://apis-sandbox.fedex.com/track/v1/trackingnumbers";
//
//        logger.info("json : " + json.toString());
//
//
//        HttpEntity<String> entity = new HttpEntity<>(json, httpHeaders);
//
//        logger.info("entity : " + entity.toString());
//
//
//        try {
//            long inTime = System.currentTimeMillis();
//            FedExResponseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, FedExTrackingResponse.class);
//            long outTime = System.currentTimeMillis();
//            logger.info("Latency of Rest : " + (outTime - inTime));
//
//        } catch (Exception e) {
//            logger.info("Order Tracking of FedEx failed Due to " + e.toString());
//            //SfxForwardResponse sfxForwardResponse = new SfxForwardResponse();
////            cancelShipmentResponse.setMessage("Order Placement of sfx failed Due to " + e.toString());
////            cancelShipmentResponse.setMessage("Failed");
//            logger.info(trackingResponse.toString());
//            return trackingResponse;
//        }
//
//        return FedExResponseEntity.getBody();
//
//    }
//
//
//}
