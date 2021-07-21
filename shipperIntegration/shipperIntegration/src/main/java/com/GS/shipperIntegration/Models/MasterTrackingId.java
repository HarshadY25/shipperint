package com.GS.shipperIntegration.Models;

public class MasterTrackingId {
    private String formId;
    private String trackingIdType;
    private String uspsApplicationId;
    private String trackingNumber;

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getTrackingIdType() {
        return trackingIdType;
    }

    public void setTrackingIdType(String trackingIdType) {
        this.trackingIdType = trackingIdType;
    }

    public String getUspsApplicationId() {
        return uspsApplicationId;
    }

    public void setUspsApplicationId(String uspsApplicationId) {
        this.uspsApplicationId = uspsApplicationId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
