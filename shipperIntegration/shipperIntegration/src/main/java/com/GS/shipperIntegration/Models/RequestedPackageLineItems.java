package com.GS.shipperIntegration.Models;

public class RequestedPackageLineItems {
    private Weight weight;

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public RequestedPackageLineItems(Weight weight) {
        this.weight = weight;
    }
//Left the remaining non required keys
}
