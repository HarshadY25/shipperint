package com.GS.shipperIntegration.Controller;

import com.GS.shipperIntegration.EntityModels.OrderPlacementResponse;
import com.GS.shipperIntegration.Models.NDRResponse;
import com.GS.shipperIntegration.Models.NDRResponse.NdrResponse;
import com.GS.shipperIntegration.Models.PlaceOrderRequest;
import com.GS.shipperIntegration.Models.TrackOrderResponse;
import com.GS.shipperIntegration.Service.FedExImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ShipperIntegrationController {
//    @Autowired
    private FedExImpl fedExImpl = new FedExImpl();

    public OrderPlacementResponse forwardOrderCreation(@RequestBody PlaceOrderRequest placeOrderRequest, String orgId) throws IOException {
        OrderPlacementResponse orderPlacementResponse = new OrderPlacementResponse();
        orderPlacementResponse.setEstimatedShippingCost(placeOrderRequest.getEstimatedShippingCost());
        if (placeOrderRequest.getShipperId() == 4) {
            orderPlacementResponse = fedExImpl.fedExOrderPlacementResponse(placeOrderRequest, orgId);
        }
        return orderPlacementResponse;
    }

    public ArrayList<TrackOrderResponse.EachShipment> trackOrder(HashMap<Integer, ArrayList<String>> awbPerShipper) throws Exception {
//        awbPerShipper.put(4, "020207021381215");
        HashMap<Integer, ArrayList<TrackOrderResponse.EachShipment>> trackOrderPerShipper = new HashMap<>();

        ArrayList<TrackOrderResponse.EachShipment> fedExTrackResponse = null;

        for (int shipperID : awbPerShipper.keySet()) {
            if (shipperID == 4) {
                fedExTrackResponse = fedExImpl.orderTrackingFwd(awbPerShipper.get(4));
                trackOrderPerShipper.put(4, fedExTrackResponse);
            }
        }
        return fedExTrackResponse;
    }

    public NDRResponse initiateRTO(ArrayList<String> fedexNDR, OrderPlacementResponse shipmentDetails ) throws JsonProcessingException {
        NDRResponse ndrResponse = new NDRResponse();
        ArrayList<NdrResponse> nDRResponse = new ArrayList<>();
        ndrResponse.setNDRResponse(nDRResponse);
        NDRResponse ndrResponseFedex = new NDRResponse();

        if (fedexNDR.size() > 0) {
            ndrResponseFedex = fedExImpl.initiateRTO(fedexNDR,shipmentDetails);
        }

        if (ndrResponseFedex != null) {
            if (ndrResponseFedex.getNDRResponse() != null && ndrResponseFedex.getNDRResponse().size() > 0)
                ndrResponse.getNDRResponse().add(ndrResponseFedex.getNDRResponse().get(0));
        }

        return ndrResponse;
    }
}
