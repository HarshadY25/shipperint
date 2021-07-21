package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class LatestStatusDetail {
    private Address scanLocation;
    private String code;
    private String derivedCode;
    private String statusByLocale;
    private String description;
    private ArrayList<AncillaryDetails> ancillaryDetails;

    public Address getScanLocation() {
        return scanLocation;
    }

    public void setScanLocation(Address scanLocation) {
        this.scanLocation = scanLocation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDerivedCode() {
        return derivedCode;
    }

    public void setDerivedCode(String derivedCode) {
        this.derivedCode = derivedCode;
    }

    public String getStatusByLocale() {
        return statusByLocale;
    }

    public void setStatusByLocale(String statusByLocale) {
        this.statusByLocale = statusByLocale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<AncillaryDetails> getAncillaryDetails() {
        return ancillaryDetails;
    }

    public void setAncillaryDetails(ArrayList<AncillaryDetails> ancillaryDetails) {
        this.ancillaryDetails = ancillaryDetails;
    }
}
