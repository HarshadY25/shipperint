package com.GS.shipperIntegration.Models;

public class CommercialInvoice {
    private String shipmentPurpose;

    public String getShipmentPurpose() {
        return shipmentPurpose;
    }

    public void setShipmentPurpose(String shipmentPurpose) {
        this.shipmentPurpose = shipmentPurpose;
    }

    public CommercialInvoice(String shipmentPurpose) {
        this.shipmentPurpose = shipmentPurpose;
    }
}
