package com.GS.shipperIntegration.Models;

public class EstimatedDeliveryTimeWindow {
    private String description;
    private String type;
    private Window window;
    private enum type {
        ACTUAL_DELIVERY, ACTUAL_PICKUP, ACTUAL_TENDER,
        ANTICIPATED_TENDER, APPOINTMENT_DELIVERY,
        ATTEMPTED_DELIVERY, COMMITMENT, ESTIMATED_ARRIVAL_AT_GATEWAY,
        ESTIMATED_DELIVERY, ESTIMATED_PICKUP, ESTIMATED_RETURN_TO_STATION,
        SHIP, SHIPMENT_DATA_RECEIVED
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }
}
