package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class PackageRating {
    private double effectiveNetDiscount;
    private String actualRateType;
    private ArrayList<PackageRateDetail> packageRateDetails;

    public double getEffectiveNetDiscount() {
        return effectiveNetDiscount;
    }

    public void setEffectiveNetDiscount(double effectiveNetDiscount) {
        this.effectiveNetDiscount = effectiveNetDiscount;
    }

    public String getActualRateType() {
        return actualRateType;
    }

    public void setActualRateType(String actualRateType) {
        this.actualRateType = actualRateType;
    }

    public ArrayList<PackageRateDetail> getPackageRateDetails() {
        return packageRateDetails;
    }

    public void setPackageRateDetails(ArrayList<PackageRateDetail> packageRateDetails) {
        this.packageRateDetails = packageRateDetails;
    }
}
