package com.GS.shipperIntegration.Models;

public class ShippingChargesPayment {
    private enum paymentType {
        SENDER, RECIPIENT, THIRD_PARTY, COLLECT
    }
    private Payor payor;
    private String paymentType = "SENDER";

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Payor getPayor() {
        return payor;
    }

    public void setPayor(Payor payor) {
        this.payor = payor;
    }
}
