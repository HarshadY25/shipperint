package com.GS.shipperIntegration.Models;

public class FreightDiscount {
    private double amount;
    private String rateDiscountType;
    private double percent;
    private String description;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRateDiscountType() {
        return rateDiscountType;
    }

    public void setRateDiscountType(String rateDiscountType) {
        this.rateDiscountType = rateDiscountType;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
