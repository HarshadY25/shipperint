package com.GS.shipperIntegration.Models;

public class CustomsValue {
    private double amount;
    private String currency;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CustomsValue(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
