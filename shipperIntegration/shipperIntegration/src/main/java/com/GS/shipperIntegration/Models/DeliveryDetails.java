package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class DeliveryDetails {
    private String receivedByName;
    private String destinationServiceArea;
    private String destinationServiceAreaDescription;
    private String locationDescription;
    private String locationType;
    private Address actualDeliveryAddress;
    private boolean deliveryToday;
    private String signedByName;
    private String officeOrderDeliveryMethod;
    private String deliveryAttempts;
    private ArrayList<DeliveryOptionEligibilityDetail> deliveryOptionEligibilityDetails;

    public String getReceivedByName() {
        return receivedByName;
    }

    public void setReceivedByName(String receivedByName) {
        this.receivedByName = receivedByName;
    }

    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }

    public void setDestinationServiceArea(String destinationServiceArea) {
        this.destinationServiceArea = destinationServiceArea;
    }

    public String getDestinationServiceAreaDescription() {
        return destinationServiceAreaDescription;
    }

    public void setDestinationServiceAreaDescription(String destinationServiceAreaDescription) {
        this.destinationServiceAreaDescription = destinationServiceAreaDescription;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public Address getActualDeliveryAddress() {
        return actualDeliveryAddress;
    }

    public void setActualDeliveryAddress(Address actualDeliveryAddress) {
        this.actualDeliveryAddress = actualDeliveryAddress;
    }

    public boolean isDeliveryToday() {
        return deliveryToday;
    }

    public void setDeliveryToday(boolean deliveryToday) {
        this.deliveryToday = deliveryToday;
    }

    public String getSignedByName() {
        return signedByName;
    }

    public void setSignedByName(String signedByName) {
        this.signedByName = signedByName;
    }

    public String getOfficeOrderDeliveryMethod() {
        return officeOrderDeliveryMethod;
    }

    public void setOfficeOrderDeliveryMethod(String officeOrderDeliveryMethod) {
        this.officeOrderDeliveryMethod = officeOrderDeliveryMethod;
    }

    public String getDeliveryAttempts() {
        return deliveryAttempts;
    }

    public void setDeliveryAttempts(String deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }

    public ArrayList<DeliveryOptionEligibilityDetail> getDeliveryOptionEligibilityDetails() {
        return deliveryOptionEligibilityDetails;
    }

    public void setDeliveryOptionEligibilityDetails(ArrayList<DeliveryOptionEligibilityDetail> deliveryOptionEligibilityDetails) {
        this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
    }
}
