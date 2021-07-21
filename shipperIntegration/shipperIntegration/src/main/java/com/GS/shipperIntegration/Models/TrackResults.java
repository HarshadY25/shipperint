package com.GS.shipperIntegration.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class TrackResults {
    private TrackingNumberInfo trackingNumberInfo;
    private AdditionalTrackingInfo additionalTrackingInfo;
    private DistanceToDestination distanceToDestination;
    private ConsolidationDetail consolidationDetail;
    private String meterNumber;
    private ReturnDetail returnDetail;
    private ServiceDetail serviceDetail;
    private DestinationLocation destinationLocation;
    private LatestStatusDetail latestStatusDetail;
    private ServiceCommitMessage serviceCommitMessage;
    private InformationNotes informationNotes;
    private ResponseError error;
    private ArrayList<SpecialHandlings> specialHandlings;
    private ArrayList<AvailableImage> availableImages;
    private DeliveryDetails deliveryDetails;
    private ArrayList<ScanEvent> scanEvents;
    private ArrayList<DateAndTime> dateAndTimes;
    private PackageDetails packageDetails;
    private String goodsClassificationCode;
    private FedExLocation holdAtLocation;
    private ArrayList<CustomDeliveryOption> customDeliveryOptions;
    private EstimatedDeliveryTimeWindow estimatedDeliveryTimeWindow;
    private ArrayList<PieceCount> pieceCounts;
    private FedExLocation originLocation;
    private Party recipientInformation;
    private EstimatedDeliveryTimeWindow standardTransitTimeWindow;
    private ShipmentDetails shipmentDetails;
    private ReasonDetail reasonDetail;
    private Party shipperInformation;
    private Address lastUpdatedDestinationAddress;
    private ArrayList<String> availableNotifications;

    @JsonProperty("trackingNumberInfo")
    public TrackingNumberInfo getTrackingNumberInfo() {
        return trackingNumberInfo;
    }

    public void setTrackingNumberInfo(TrackingNumberInfo trackingNumberInfo) {
        this.trackingNumberInfo = trackingNumberInfo;
    }

    public AdditionalTrackingInfo getAdditionalTrackingInfo() {
        return additionalTrackingInfo;
    }

    public void setAdditionalTrackingInfo(AdditionalTrackingInfo additionalTrackingInfo) {
        this.additionalTrackingInfo = additionalTrackingInfo;
    }

    public DistanceToDestination getDistanceToDestination() {
        return distanceToDestination;
    }

    public void setDistanceToDestination(DistanceToDestination distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }

    public ConsolidationDetail getConsolidationDetail() {
        return consolidationDetail;
    }

    public void setConsolidationDetail(ConsolidationDetail consolidationDetail) {
        this.consolidationDetail = consolidationDetail;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }

    public ReturnDetail getReturnDetail() {
        return returnDetail;
    }

    public void setReturnDetail(ReturnDetail returnDetail) {
        this.returnDetail = returnDetail;
    }

    public ServiceDetail getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(ServiceDetail serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    public DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(DestinationLocation destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public LatestStatusDetail getLatestStatusDetail() {
        return latestStatusDetail;
    }

    public void setLatestStatusDetail(LatestStatusDetail latestStatusDetail) {
        this.latestStatusDetail = latestStatusDetail;
    }

    public ServiceCommitMessage getServiceCommitMessage() {
        return serviceCommitMessage;
    }

    public void setServiceCommitMessage(ServiceCommitMessage serviceCommitMessage) {
        this.serviceCommitMessage = serviceCommitMessage;
    }

    public InformationNotes getInformationNotes() {
        return informationNotes;
    }

    public void setInformationNotes(InformationNotes informationNotes) {
        this.informationNotes = informationNotes;
    }

    public ResponseError getError() {
        return error;
    }

    public void setError(ResponseError error) {
        this.error = error;
    }

    public ArrayList<SpecialHandlings> getSpecialHandlings() {
        return specialHandlings;
    }

    public void setSpecialHandlings(ArrayList<SpecialHandlings> specialHandlings) {
        this.specialHandlings = specialHandlings;
    }

    public ArrayList<AvailableImage> getAvailableImages() {
        return availableImages;
    }

    public void setAvailableImages(ArrayList<AvailableImage> availableImages) {
        this.availableImages = availableImages;
    }

    public DeliveryDetails getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(DeliveryDetails deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    public ArrayList<ScanEvent> getScanEvents() {
        return scanEvents;
    }

    public void setScanEvents(ArrayList<ScanEvent> scanEvents) {
        this.scanEvents = scanEvents;
    }

    public ArrayList<DateAndTime> getDateAndTimes() {
        return dateAndTimes;
    }

    public void setDateAndTimes(ArrayList<DateAndTime> dateAndTimes) {
        this.dateAndTimes = dateAndTimes;
    }

    public PackageDetails getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(PackageDetails packageDetails) {
        this.packageDetails = packageDetails;
    }

    public String getGoodsClassificationCode() {
        return goodsClassificationCode;
    }

    public void setGoodsClassificationCode(String goodsClassificationCode) {
        this.goodsClassificationCode = goodsClassificationCode;
    }

    public FedExLocation getHoldAtLocation() {
        return holdAtLocation;
    }

    public void setHoldAtLocation(FedExLocation holdAtLocation) {
        this.holdAtLocation = holdAtLocation;
    }

    public ArrayList<CustomDeliveryOption> getCustomDeliveryOptions() {
        return customDeliveryOptions;
    }

    public void setCustomDeliveryOptions(ArrayList<CustomDeliveryOption> customDeliveryOptions) {
        this.customDeliveryOptions = customDeliveryOptions;
    }

    public EstimatedDeliveryTimeWindow getEstimatedDeliveryTimeWindow() {
        return estimatedDeliveryTimeWindow;
    }

    public void setEstimatedDeliveryTimeWindow(EstimatedDeliveryTimeWindow estimatedDeliveryTimeWindow) {
        this.estimatedDeliveryTimeWindow = estimatedDeliveryTimeWindow;
    }

    public ArrayList<PieceCount> getPieceCounts() {
        return pieceCounts;
    }

    public void setPieceCounts(ArrayList<PieceCount> pieceCounts) {
        this.pieceCounts = pieceCounts;
    }

    public FedExLocation getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(FedExLocation originLocation) {
        this.originLocation = originLocation;
    }

    public Party getRecipientInformation() {
        return recipientInformation;
    }

    public void setRecipientInformation(Party recipientInformation) {
        this.recipientInformation = recipientInformation;
    }

    public EstimatedDeliveryTimeWindow getStandardTransitTimeWindow() {
        return standardTransitTimeWindow;
    }

    public void setStandardTransitTimeWindow(EstimatedDeliveryTimeWindow standardTransitTimeWindow) {
        this.standardTransitTimeWindow = standardTransitTimeWindow;
    }

    public ShipmentDetails getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(ShipmentDetails shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public ReasonDetail getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(ReasonDetail reasonDetail) {
        this.reasonDetail = reasonDetail;
    }

    public Party getShipperInformation() {
        return shipperInformation;
    }

    public void setShipperInformation(Party shipperInformation) {
        this.shipperInformation = shipperInformation;
    }

    public Address getLastUpdatedDestinationAddress() {
        return lastUpdatedDestinationAddress;
    }

    public void setLastUpdatedDestinationAddress(Address lastUpdatedDestinationAddress) {
        this.lastUpdatedDestinationAddress = lastUpdatedDestinationAddress;
    }

    public ArrayList<String> getAvailableNotifications() {
        return availableNotifications;
    }

    public void setAvailableNotifications(ArrayList<String> availableNotifications) {
        this.availableNotifications = availableNotifications;
    }
}
