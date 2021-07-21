package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class RequestedShipment {

    private Party shipper;
    private ArrayList<Party> recipients;
    private enum pickupType {
        CONTACT_FEDEX_TO_SCHEDULE,
        DROPOFF_AT_FEDEX_LOCATION,
        USE_SCHEDULED_PICKUP
    }
    private String pickupType = "USE_SCHEDULED_PICKUP";
    private String serviceType = "FEDEX_EXPRESS_SAVER";
    private String packagingType = "YOUR_PACKAGING";
    private ShippingChargesPayment shippingChargesPayment;
    private LabelSpecification labelSpecification;
    private ArrayList<RequestedPackageLineItems> requestedPackageLineItems;
    private CustomsClearanceDetail customsClearanceDetail;

    public String getPickupType() {
        return pickupType;
    }

    public void setPickupType(String pickupType) {
        this.pickupType = pickupType;
    }

    public Party getShipper() {
        return shipper;
    }

    public void setShipper(Party shipper) {
        this.shipper = shipper;
    }

    public ArrayList<Party> getRecipients() {
        return recipients;
    }

    public void setRecipients(ArrayList<Party> recipients) {
        this.recipients = recipients;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public ShippingChargesPayment getShippingChargesPayment() {
        return shippingChargesPayment;
    }

    public void setShippingChargesPayment(ShippingChargesPayment shippingChargesPayment) {
        this.shippingChargesPayment = shippingChargesPayment;
    }

    public LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }

    public void setLabelSpecification(LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }

    public ArrayList<RequestedPackageLineItems> getRequestedPackageLineItems() {
        return requestedPackageLineItems;
    }

    public CustomsClearanceDetail getCustomsClearanceDetail() {
        return customsClearanceDetail;
    }

    public void setCustomsClearanceDetail(CustomsClearanceDetail customsClearanceDetail) {
        this.customsClearanceDetail = customsClearanceDetail;
    }

    public void setRequestedPackageLineItems(ArrayList<RequestedPackageLineItems> requestedPackageLineItems) {
        this.requestedPackageLineItems = requestedPackageLineItems;
    }
}
