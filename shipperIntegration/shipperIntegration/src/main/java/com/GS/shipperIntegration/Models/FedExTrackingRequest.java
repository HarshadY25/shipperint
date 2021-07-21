package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class FedExTrackingRequest {
    private boolean includeDetailedScans;
    private ArrayList<TrackingInfo> trackingInfo;

    public boolean isIncludeDetailedScans() {
        return includeDetailedScans;
    }

    public void setIncludeDetailedScans(boolean includeDetailedScans) {
        this.includeDetailedScans = includeDetailedScans;
    }

    public ArrayList<TrackingInfo> getTrackingInfo() {
        return trackingInfo;
    }

    public void setTrackingInfo(ArrayList<TrackingInfo> trackingInfo) {
        this.trackingInfo = trackingInfo;
    }
}
