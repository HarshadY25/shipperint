package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class Output {
    private ArrayList<ShippingTransactionDetails> transactionShipments;
    private ArrayList<Alerts> alerts;
    private String jobId;

    public ArrayList<ShippingTransactionDetails> getTransactionShipments() {
        return transactionShipments;
    }

    public void setTransactionShipments(ArrayList<ShippingTransactionDetails> transactionShipments) {
        this.transactionShipments = transactionShipments;
    }

    public ArrayList<Alerts> getAlerts() {
        return alerts;
    }

    public void setAlerts(ArrayList<Alerts> alerts) {
        this.alerts = alerts;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}
