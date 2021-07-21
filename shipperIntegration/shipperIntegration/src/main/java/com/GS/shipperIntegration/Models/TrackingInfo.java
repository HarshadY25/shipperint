package com.GS.shipperIntegration.Models;

public class TrackingInfo {
    private TrackingNumberInfo trackingNumberInfo;

    public TrackingNumberInfo getTrackingNumberInfo() {
        return trackingNumberInfo;
    }

    public void setTrackingNumberInfo(TrackingNumberInfo trackingNumberInfo) {
        this.trackingNumberInfo = trackingNumberInfo;
    }

    public TrackingInfo(TrackingNumberInfo trackingNumberInfo) {
        this.trackingNumberInfo = trackingNumberInfo;
    }
}
