package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class ShippingTransactionDetails {
    private String serviceType;
    private String shipDatestamp;
    private String serviceCategory;
    private ArrayList<ShipmentDocuments> shipmentDocuments;
    private ArrayList<PieceInformation> pieceResponses;
    private String serviceName;
    private ArrayList<Alerts> alerts;
    private CompletedShipmentDetails completedShipmentDetail;
    private ShipmentAdvisoryDetails shipmentAdvisoryDetails;
    private String masterTrackingNumber;

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getShipDatestamp() {
        return shipDatestamp;
    }

    public void setShipDatestamp(String shipDatestamp) {
        this.shipDatestamp = shipDatestamp;
    }

    public String getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public ArrayList<ShipmentDocuments> getShipmentDocuments() {
        return shipmentDocuments;
    }

    public void setShipmentDocuments(ArrayList<ShipmentDocuments> shipmentDocuments) {
        this.shipmentDocuments = shipmentDocuments;
    }

    public ArrayList<PieceInformation> getPieceResponses() {
        return pieceResponses;
    }

    public void setPieceResponses(ArrayList<PieceInformation> pieceResponses) {
        this.pieceResponses = pieceResponses;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ArrayList<Alerts> getAlerts() {
        return alerts;
    }

    public void setAlerts(ArrayList<Alerts> alerts) {
        this.alerts = alerts;
    }

    public CompletedShipmentDetails getCompletedShipmentDetail() {
        return completedShipmentDetail;
    }

    public void setCompletedShipmentDetail(CompletedShipmentDetails completedShipmentDetail) {
        this.completedShipmentDetail = completedShipmentDetail;
    }

    public ShipmentAdvisoryDetails getShipmentAdvisoryDetails() {
        return shipmentAdvisoryDetails;
    }

    public void setShipmentAdvisoryDetails(ShipmentAdvisoryDetails shipmentAdvisoryDetails) {
        this.shipmentAdvisoryDetails = shipmentAdvisoryDetails;
    }

    public String getMasterTrackingNumber() {
        return masterTrackingNumber;
    }

    public void setMasterTrackingNumber(String masterTrackingNumber) {
        this.masterTrackingNumber = masterTrackingNumber;
    }
}
