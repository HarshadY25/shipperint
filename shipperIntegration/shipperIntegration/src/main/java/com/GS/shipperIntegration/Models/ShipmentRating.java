package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class ShipmentRating {
    private String actualRateType;
    private ArrayList<ShipmentRateDetail> shipmentRateDetails;

    public String getActualRateType() {
        return actualRateType;
    }

    public void setActualRateType(String actualRateType) {
        this.actualRateType = actualRateType;
    }

    public ArrayList<ShipmentRateDetail> getShipmentRateDetails() {
        return shipmentRateDetails;
    }

    public void setShipmentRateDetails(ArrayList<ShipmentRateDetail> shipmentRateDetails) {
        this.shipmentRateDetails = shipmentRateDetails;
    }
}
