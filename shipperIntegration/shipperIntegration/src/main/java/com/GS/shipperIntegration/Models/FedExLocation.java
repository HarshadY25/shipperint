package com.GS.shipperIntegration.Models;

public class FedExLocation {
    private String locationId;
    private Party locationContactAndAddress;
    private enum locationType {
        FEDEX_AUTHORIZED_SHIP_CENTER, FEDEX_OFFICE,
        FEDEX_SELF_SERVICE_LOCATION, FEDEX_STAFFED,
        RETAIL_ALLICANCE_LOCATION, FEDEX_GROUND_TERMINAL,
        FEDEX_ONSITE
    }
    private String locationType;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Party getLocationContactAndAddress() {
        return locationContactAndAddress;
    }

    public void setLocationContactAndAddress(Party locationContactAndAddress) {
        this.locationContactAndAddress = locationContactAndAddress;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
}
