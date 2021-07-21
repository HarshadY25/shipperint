package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class FedExTrackingOutput {
    ArrayList<CompleteTrackResults> completeTrackResults;
    private Alerts alerts;

    public ArrayList<CompleteTrackResults> getCompleteTrackResults() {
        return completeTrackResults;
    }

    public void setCompleteTrackResults(ArrayList<CompleteTrackResults> completeTrackResults) {
        this.completeTrackResults = completeTrackResults;
    }

    public Alerts getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
    }
}
