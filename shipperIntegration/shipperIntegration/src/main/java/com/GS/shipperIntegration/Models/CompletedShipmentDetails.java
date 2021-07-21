package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class CompletedShipmentDetails {
    private ArrayList<CompletedPackageDetail> completedPackageDetails;
    private OperationalDetailForCompletedShipment operationalDetail;
    private String carrierCode;
//    private String serviceCategory;
//    private CompletedHoldAtLocation completedHoldAtLocation;
//    private CompletedEtdDetail completedEtdDetail;
    private String packagingDescription;
    private MasterTrackingId masterTrackingId;
    private ServiceDescription serviceDescription;
    private boolean usDomestic;
//    private HazardousShipmentDetail hazardousShipmentDetail;
    private ShipmentRating shipmentRating;
    private DocumentRequirements documentRequirements;
    private String exportComplianceStatement;
    private AccessDetail accessDetail;

    public ArrayList<CompletedPackageDetail> getCompletedPackageDetails() {
        return completedPackageDetails;
    }

    public void setCompletedPackageDetails(ArrayList<CompletedPackageDetail> completedPackageDetails) {
        this.completedPackageDetails = completedPackageDetails;
    }

    public OperationalDetailForCompletedShipment getOperationalDetail() {
        return operationalDetail;
    }

    public void setOperationalDetail(OperationalDetailForCompletedShipment operationalDetail) {
        this.operationalDetail = operationalDetail;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getPackagingDescription() {
        return packagingDescription;
    }

    public void setPackagingDescription(String packagingDescription) {
        this.packagingDescription = packagingDescription;
    }

    public MasterTrackingId getMasterTrackingId() {
        return masterTrackingId;
    }

    public void setMasterTrackingId(MasterTrackingId masterTrackingId) {
        this.masterTrackingId = masterTrackingId;
    }

    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(ServiceDescription serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public boolean isUsDomestic() {
        return usDomestic;
    }

    public void setUsDomestic(boolean usDomestic) {
        this.usDomestic = usDomestic;
    }

    public ShipmentRating getShipmentRating() {
        return shipmentRating;
    }

    public void setShipmentRating(ShipmentRating shipmentRating) {
        this.shipmentRating = shipmentRating;
    }

    public DocumentRequirements getDocumentRequirements() {
        return documentRequirements;
    }

    public void setDocumentRequirements(DocumentRequirements documentRequirements) {
        this.documentRequirements = documentRequirements;
    }

    public String getExportComplianceStatement() {
        return exportComplianceStatement;
    }

    public void setExportComplianceStatement(String exportComplianceStatement) {
        this.exportComplianceStatement = exportComplianceStatement;
    }

    public AccessDetail getAccessDetail() {
        return accessDetail;
    }

    public void setAccessDetail(AccessDetail accessDetail) {
        this.accessDetail = accessDetail;
    }
}
