package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class FedExCancelShipmentResponse {
    private String transactionId;
    private String customerTransactionId;
    private FedExCancelShipmentOutput output;
    private int responseStatus;
    private ArrayList<CodeAndMsg> errors;

    public ArrayList<CodeAndMsg> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<CodeAndMsg> errors) {
        this.errors = errors;
    }

    public int getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerTransactionId() {
        return customerTransactionId;
    }

    public void setCustomerTransactionId(String customerTransactionId) {
        this.customerTransactionId = customerTransactionId;
    }

    public FedExCancelShipmentOutput getOutput() {
        return output;
    }

    public void setOutput(FedExCancelShipmentOutput output) {
        this.output = output;
    }
}
