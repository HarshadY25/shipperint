package com.GS.shipperIntegration.Models;

public class AvailableImage {
    private enum size {
        SMALL, LARGE
    }
    private enum type {
        SIGNATURE_PROOF_OF_DELIVERY, BILL_OF_LADING
    }
    private String size;
    private String type;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
