package com.GS.shipperIntegration.Models;

public class TrackingNumberInfo {
    private String trackingNumber;
    private String carrierCode;
    private String trackingNumberUniqueId;

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getTrackingNumberUniqueId() {
        return trackingNumberUniqueId;
    }

    public void setTrackingNumberUniqueId(String trackingNumberUniqueId) {
        this.trackingNumberUniqueId = trackingNumberUniqueId;
    }

    public TrackingNumberInfo(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public TrackingNumberInfo() {
    }
}
