package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class AdditionalTrackingInfo {
    private boolean hasAssociatedShipments;
    private String nickname;
    private String shipmentNotes;
    private ArrayList<PackageIdentifiers> packageIdentifiers;

    public boolean isHasAssociatedShipments() {
        return hasAssociatedShipments;
    }

    public void setHasAssociatedShipments(boolean hasAssociatedShipments) {
        this.hasAssociatedShipments = hasAssociatedShipments;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getShipmentNotes() {
        return shipmentNotes;
    }

    public void setShipmentNotes(String shipmentNotes) {
        this.shipmentNotes = shipmentNotes;
    }

    public ArrayList<PackageIdentifiers> getPackageIdentifiers() {
        return packageIdentifiers;
    }

    public void setPackageIdentifiers(ArrayList<PackageIdentifiers> packageIdentifiers) {
        this.packageIdentifiers = packageIdentifiers;
    }
}
