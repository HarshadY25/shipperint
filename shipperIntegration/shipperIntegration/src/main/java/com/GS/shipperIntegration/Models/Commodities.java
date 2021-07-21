package com.GS.shipperIntegration.Models;

public class Commodities {
    private String description;
    private String countryOfManufacture;
    private Weight weight;
    private int quantity;
    private String quantityUnits;
    private UnitPrice unitPrice;
    private CustomsValue customsValue;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getQuantityUnits() {
        return quantityUnits;
    }

    public void setQuantityUnits(String quantityUnits) {
        this.quantityUnits = quantityUnits;
    }

    public UnitPrice getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    public CustomsValue getCustomsValue() {
        return customsValue;
    }

    public void setCustomsValue(CustomsValue customsValue) {
        this.customsValue = customsValue;
    }
}
