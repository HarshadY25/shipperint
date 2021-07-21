package com.GS.shipperIntegration.Models;

public class Weight {
    private String units;
    private double value;

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Weight(String units, double value) {
        this.units = units;
        this.value = value;
    }

    public Weight() {
    }
}
