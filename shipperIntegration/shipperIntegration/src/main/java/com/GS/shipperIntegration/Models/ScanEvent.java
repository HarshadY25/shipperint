package com.GS.shipperIntegration.Models;

public class ScanEvent {
    private String date;
    private String derivedStatus;
    private String exceptionDescription;
    private String eventDescription;
    private String eventType;
    private String derivedStatusCode;
    private String exceptionCode;
    private FedExLocation scanLocation;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDerivedStatus() {
        return derivedStatus;
    }

    public void setDerivedStatus(String derivedStatus) {
        this.derivedStatus = derivedStatus;
    }

    public String getExceptionDescription() {
        return exceptionDescription;
    }

    public void setExceptionDescription(String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDerivedStatusCode() {
        return derivedStatusCode;
    }

    public void setDerivedStatusCode(String derivedStatusCode) {
        this.derivedStatusCode = derivedStatusCode;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public FedExLocation getScanLocation() {
        return scanLocation;
    }

    public void setScanLocation(FedExLocation scanLocation) {
        this.scanLocation = scanLocation;
    }
}
