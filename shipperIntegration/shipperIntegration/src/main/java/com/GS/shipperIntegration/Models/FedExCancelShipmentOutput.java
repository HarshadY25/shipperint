package com.GS.shipperIntegration.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FedExCancelShipmentOutput {
    private boolean cancelledShipment;
    private boolean cancelledHistory;
    private String successMessage;
    private Alerts alerts;

    @JsonProperty("cancelledShipment")
    public boolean isCancelledShipment() {
        return cancelledShipment;
    }

    public void setCancelledShipment(boolean cancelledShipment) {
        this.cancelledShipment = cancelledShipment;
    }

    @JsonProperty("cancelledHistory")
    public boolean isCancelledHistory() {
        return cancelledHistory;
    }

    public void setCancelledHistory(boolean cancelledHistory) {
        this.cancelledHistory = cancelledHistory;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    public Alerts getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
    }

}
