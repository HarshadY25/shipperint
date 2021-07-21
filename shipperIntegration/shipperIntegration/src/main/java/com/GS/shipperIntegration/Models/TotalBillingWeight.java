package com.GS.shipperIntegration.Models;

public class TotalBillingWeight {
    private enum units {
        KG, LB
    }
    private String units;
    private double number;

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
