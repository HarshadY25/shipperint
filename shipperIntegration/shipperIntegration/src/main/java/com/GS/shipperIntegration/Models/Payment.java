package com.GS.shipperIntegration.Models;

public class Payment {
    // TO DO: Add enum values of paymentType
    private String paymentType;

    private Payor payor;

    public Payor getPayor() {
        return payor;
    }

    public void setPayor(Payor payor) {
        this.payor = payor;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
