package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class PieceInformation {
    private double netChargeAmount;
    private ArrayList<TransactionDetail> transactionDetails;
    private ArrayList<ShipmentDocuments> packageDocuments;
    private String acceptanceTrackingNumber;
    private enum serviceCategory {
        EXPRESS, GROUND, EXPRESS_FREIGHT, FREIGHT,
        SMARTPOST, EXPRESS_PARCEL, NULL
    }
    private String serviceCategory;
    private String listCustomerTotalCharge;
    private String deliveryTimestamp;
    private String trackingIdType;
    private double additionalChargesDiscount;
    private double netRateAmount;
    private double baseRateAmount;
    private int packageSequenceNumber;
    private double netDiscountAmount;
    private double codcollectionAmount;
    private String masterTrackingNumber;
    private String acceptanceType;
    private String trackingNumber;
    private boolean successful;
    private ArrayList<CustomerReference> customerReferences;

    public String getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public double getNetChargeAmount() {
        return netChargeAmount;
    }

    public void setNetChargeAmount(double netChargeAmount) {
        this.netChargeAmount = netChargeAmount;
    }

    public ArrayList<TransactionDetail> getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(ArrayList<TransactionDetail> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public ArrayList<ShipmentDocuments> getPackageDocuments() {
        return packageDocuments;
    }

    public void setPackageDocuments(ArrayList<ShipmentDocuments> packageDocuments) {
        this.packageDocuments = packageDocuments;
    }

    public String getAcceptanceTrackingNumber() {
        return acceptanceTrackingNumber;
    }

    public void setAcceptanceTrackingNumber(String acceptanceTrackingNumber) {
        this.acceptanceTrackingNumber = acceptanceTrackingNumber;
    }

    public String getListCustomerTotalCharge() {
        return listCustomerTotalCharge;
    }

    public void setListCustomerTotalCharge(String listCustomerTotalCharge) {
        this.listCustomerTotalCharge = listCustomerTotalCharge;
    }

    public String getDeliveryTimestamp() {
        return deliveryTimestamp;
    }

    public void setDeliveryTimestamp(String deliveryTimestamp) {
        this.deliveryTimestamp = deliveryTimestamp;
    }

    public String getTrackingIdType() {
        return trackingIdType;
    }

    public void setTrackingIdType(String trackingIdType) {
        this.trackingIdType = trackingIdType;
    }

    public double getAdditionalChargesDiscount() {
        return additionalChargesDiscount;
    }

    public void setAdditionalChargesDiscount(double additionalChargesDiscount) {
        this.additionalChargesDiscount = additionalChargesDiscount;
    }

    public double getNetRateAmount() {
        return netRateAmount;
    }

    public void setNetRateAmount(double netRateAmount) {
        this.netRateAmount = netRateAmount;
    }

    public double getBaseRateAmount() {
        return baseRateAmount;
    }

    public void setBaseRateAmount(double baseRateAmount) {
        this.baseRateAmount = baseRateAmount;
    }

    public int getPackageSequenceNumber() {
        return packageSequenceNumber;
    }

    public void setPackageSequenceNumber(int packageSequenceNumber) {
        this.packageSequenceNumber = packageSequenceNumber;
    }

    public double getNetDiscountAmount() {
        return netDiscountAmount;
    }

    public void setNetDiscountAmount(double netDiscountAmount) {
        this.netDiscountAmount = netDiscountAmount;
    }

    public double getCodcollectionAmount() {
        return codcollectionAmount;
    }

    public void setCodcollectionAmount(double codcollectionAmount) {
        this.codcollectionAmount = codcollectionAmount;
    }

    public String getMasterTrackingNumber() {
        return masterTrackingNumber;
    }

    public void setMasterTrackingNumber(String masterTrackingNumber) {
        this.masterTrackingNumber = masterTrackingNumber;
    }

    public String getAcceptanceType() {
        return acceptanceType;
    }

    public void setAcceptanceType(String acceptanceType) {
        this.acceptanceType = acceptanceType;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public ArrayList<CustomerReference> getCustomerReferences() {
        return customerReferences;
    }

    public void setCustomerReferences(ArrayList<CustomerReference> customerReferences) {
        this.customerReferences = customerReferences;
    }
}
