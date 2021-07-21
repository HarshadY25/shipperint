package com.GS.shipperIntegration.Models;

public class DestinationLocation {
    private String locationId;
    private String locationType;
    private Party locationContactAndAddress;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public Party getLocationContactAndAddress() {
        return locationContactAndAddress;
    }

    public void setLocationContactAndAddress(Party locationContactAndAddress) {
        this.locationContactAndAddress = locationContactAndAddress;
    }
}
