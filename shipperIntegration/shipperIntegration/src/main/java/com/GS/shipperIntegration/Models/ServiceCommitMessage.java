package com.GS.shipperIntegration.Models;

public class ServiceCommitMessage {
    private String message;
    private enum type {
        BROKER_DELIVERED_DESCRIPTION, CANCELLED_DESCRIPTION,
        DELIVERY_IN_MULTIPLE_PIECE_SHIPMENT, ESTIMATED_DELIVERY_DATE_UNAVAILABLE,
        EXCEPTION_IN_MULTIPLE_PIECE_SHIPMENT, FINAL_DELIVERY_ATTEMPTED,
        FIRST_DELIVERY_ATTEMPTED, HELD_PACKAGE_AVAILABLE_FOR_RECIPIENT_PICKUP,
        HELD_PACKAGE_AVAILABLE_FOR_RECIPIENT_PICKUP_WITH_ADDRESS,
        HELD_PACKAGE_NOT_AVAILABLE_FOR_RECIPIENT_PICKUP,
        SHIPMENT_LABEL_CREATED, SUBSEQUENT_DELIVERY_ATTEMPTED,
        USPS_DELIVERED, USPS_DELIVERING
    }
    private String type;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
