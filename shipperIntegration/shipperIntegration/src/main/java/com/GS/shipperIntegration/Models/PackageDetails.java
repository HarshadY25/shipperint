package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class PackageDetails {
    private String physicalPackagingType;
    private String sequenceNumber;
    private String undeliveredCount;
    private String count;
    private PackagingDescription packagingDescription;
    private WeightAndDimensions weightAndDimensions;
    private ArrayList<String> packageContent;
    private String contentPieceCount;
    private TotalDeclaredValue declaredValue;

    public String getPhysicalPackagingType() {
        return physicalPackagingType;
    }

    public void setPhysicalPackagingType(String physicalPackagingType) {
        this.physicalPackagingType = physicalPackagingType;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getUndeliveredCount() {
        return undeliveredCount;
    }

    public void setUndeliveredCount(String undeliveredCount) {
        this.undeliveredCount = undeliveredCount;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public PackagingDescription getPackagingDescription() {
        return packagingDescription;
    }

    public void setPackagingDescription(PackagingDescription packagingDescription) {
        this.packagingDescription = packagingDescription;
    }

    public WeightAndDimensions getWeightAndDimensions() {
        return weightAndDimensions;
    }

    public void setWeightAndDimensions(WeightAndDimensions weightAndDimensions) {
        this.weightAndDimensions = weightAndDimensions;
    }

    public ArrayList<String> getPackageContent() {
        return packageContent;
    }

    public void setPackageContent(ArrayList<String> packageContent) {
        this.packageContent = packageContent;
    }

    public String getContentPieceCount() {
        return contentPieceCount;
    }

    public void setContentPieceCount(String contentPieceCount) {
        this.contentPieceCount = contentPieceCount;
    }

    public TotalDeclaredValue getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(TotalDeclaredValue declaredValue) {
        this.declaredValue = declaredValue;
    }
}
