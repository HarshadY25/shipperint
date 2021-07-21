package com.GS.shipperIntegration.Models;

public class DateAndTime {
    private String dateTime;
    private enum type {
        ACTUAL_DELIVERY, ACTUAL_PICKUP, ACTUAL_TENDER,
        ANTICIPATED_TENDER, APPOINTMENT_DELIVERY,
        ATTEMPTED_DELIVERY, COMMITMENT, ESTIMATED_ARRIVAL_AT_GATEWAY,
        ESTIMATED_DELIVERY, ESTIMATED_PICKUP, ESTIMATED_RETURN_TO_STATION,
        SHIP, SHIPMENT_DATA_RECEIVED
    }
    private String type;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
