package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class FedExCreateShipmentResponse {
    private String transactionId;
    private String customerTransactionId;
    private ArrayList<CodeAndMsg> errors;
    private Output output;
    private int responseStatus;

    public int getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ArrayList<CodeAndMsg> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<CodeAndMsg> errors) {
        this.errors = errors;
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

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }
}
