package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class CompleteTrackResults {
    private String trackingNumber;
    private ArrayList<TrackResults> trackResults;

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public ArrayList<TrackResults> getTrackResults() {
        return trackResults;
    }

    public void setTrackResults(ArrayList<TrackResults> trackResults) {
        this.trackResults = trackResults;
    }
}
