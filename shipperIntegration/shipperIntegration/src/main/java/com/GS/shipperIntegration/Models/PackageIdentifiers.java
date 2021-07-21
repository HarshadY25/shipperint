package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class PackageIdentifiers {
    private enum type {
        BILL_OF_LADING, COD_RETURN_TRACKING_NUMBER, CUSTOMER_AUTHORIZATION_NUMBER,
        CUSTOMER_REFERENCE, DEPARTMENT, DOCUMENT_AIRWAY_BILL, EXPRESS_ALTERNATE_REFERENCE,
        FEDEX_OFFICE_JOB_ORDER_NUMBER, FREE_FORM_REFERENCE, GROUND_INTERNATIONAL,
        GROUND_SHIPMENT_ID, GROUP_MPS, INTERNATIONAL_DISTRIBUTION, INVOICE,
        JOB_GLOBAL_TRACKING_NUMBER, ORDER_GLOBAL_TRACKING_NUMBER, ORDER_TO_PAY_NUMBER,
        OUTBOUND_LINK_TO_RETURN, PART_NUMBER, PARTNER_CARRIER_NUMBER, PURCHASE_ORDER,
        REROUTE_TRACKING_NUMBER, RETURN_MATERIALS_AUTHORIZATION, RETURNED_TO_SHIPPER_TRACKING_NUMBER,
        SHIPPER_REFERENCE, STANDARD_MPS, TRACKING_CONTROL_NUMBER, TRACKING_NUMBER_OR_DOORTAG,
        TRANSBORDER_DISTRIBUTION, TRANSPORTATION_CONTROL_NUMBER, VIRTUAL_CONSOLIDATION
    }
    private String type;
    private ArrayList<String> value;
    private String trackingNumberUniqueId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getValue() {
        return value;
    }

    public void setValue(ArrayList<String> value) {
        this.value = value;
    }

    public String getTrackingNumberUniqueId() {
        return trackingNumberUniqueId;
    }

    public void setTrackingNumberUniqueId(String trackingNumberUniqueId) {
        this.trackingNumberUniqueId = trackingNumberUniqueId;
    }
}
