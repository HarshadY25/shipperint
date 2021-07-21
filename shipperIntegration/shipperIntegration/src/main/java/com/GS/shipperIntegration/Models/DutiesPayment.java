package com.GS.shipperIntegration.Models;

public class DutiesPayment {
    private String paymentType;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public DutiesPayment(String paymentType) {
        this.paymentType = paymentType;
    }
}
