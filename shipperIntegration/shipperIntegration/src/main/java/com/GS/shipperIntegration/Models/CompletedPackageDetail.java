package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class CompletedPackageDetail {
    private int sequenceNumber;
    private OperationalDetail operationalDetail;
    private String signatureOption;
    private ArrayList<TrackingId> trackingIds;
    private int groupNumber;
    private String oversizeClass;
    private PackageRating packageRating;
    private BillingWeight dryIceWeight;
    private HazardousPackageDetail hazardousPackageDetail;

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public OperationalDetail getOperationalDetail() {
        return operationalDetail;
    }

    public void setOperationalDetail(OperationalDetail operationalDetail) {
        this.operationalDetail = operationalDetail;
    }

    public String getSignatureOption() {
        return signatureOption;
    }

    public void setSignatureOption(String signatureOption) {
        this.signatureOption = signatureOption;
    }

    public ArrayList<TrackingId> getTrackingIds() {
        return trackingIds;
    }

    public void setTrackingIds(ArrayList<TrackingId> trackingIds) {
        this.trackingIds = trackingIds;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getOversizeClass() {
        return oversizeClass;
    }

    public void setOversizeClass(String oversizeClass) {
        this.oversizeClass = oversizeClass;
    }

    public PackageRating getPackageRating() {
        return packageRating;
    }

    public void setPackageRating(PackageRating packageRating) {
        this.packageRating = packageRating;
    }

    public BillingWeight getDryIceWeight() {
        return dryIceWeight;
    }

    public void setDryIceWeight(BillingWeight dryIceWeight) {
        this.dryIceWeight = dryIceWeight;
    }

    public HazardousPackageDetail getHazardousPackageDetail() {
        return hazardousPackageDetail;
    }

    public void setHazardousPackageDetail(HazardousPackageDetail hazardousPackageDetail) {
        this.hazardousPackageDetail = hazardousPackageDetail;
    }
}
