package com.GS.shipperIntegration.Models;

public class CustomDeliveryOption {
    private RequestedAppointmentDetail requestedAppointmentDetail;
    private String description;
    private String status;
    private String type;
    private enum type {
        REROUTE, APPOINTMENT, DATE_CERTAIN,
        EVENING, REDIRECT_TO_HOLD_AT_LOCATION, ELECTRONIC_SIGNATURE_RELEASE
    }

    public RequestedAppointmentDetail getRequestedAppointmentDetail() {
        return requestedAppointmentDetail;
    }

    public void setRequestedAppointmentDetail(RequestedAppointmentDetail requestedAppointmentDetail) {
        this.requestedAppointmentDetail = requestedAppointmentDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
