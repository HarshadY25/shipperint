package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class ShipmentDetails {
    private ArrayList<Content> contents;
    private boolean beforePossessionStatus;
    private String contentPieceCount;
    private ArrayList<Weight> weight;
    private ArrayList<SplitShipment> splitShipments;

    public ArrayList<Content> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Content> contents) {
        this.contents = contents;
    }

    public boolean isBeforePossessionStatus() {
        return beforePossessionStatus;
    }

    public void setBeforePossessionStatus(boolean beforePossessionStatus) {
        this.beforePossessionStatus = beforePossessionStatus;
    }

    public String getContentPieceCount() {
        return contentPieceCount;
    }

    public void setContentPieceCount(String contentPieceCount) {
        this.contentPieceCount = contentPieceCount;
    }

    public ArrayList<Weight> getWeight() {
        return weight;
    }

    public void setWeight(ArrayList<Weight> weight) {
        this.weight = weight;
    }

    public ArrayList<SplitShipment> getSplitShipments() {
        return splitShipments;
    }

    public void setSplitShipments(ArrayList<SplitShipment> splitShipments) {
        this.splitShipments = splitShipments;
    }
}
