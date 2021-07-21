package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class ShipmentRateDetail {
    private String rateZone;
    private String ratedWeightMethod;
    private double totalDutiesTaxesAndFees;
    private String pricingCode;
    private double totalFreightDiscounts;
    private double totalTaxes;
    private double totalDutiesAndTaxes;
    private double totalAncillaryFeesAndTaxes;
    private ArrayList<Tax> taxes;
    private double totalRebates;
    private double fuelSurchargePercent;
    private CurrencyExchangeRate currencyExchangeRate;
    private double totalNetFreight;
    private double totalNetFedExCharge;
//    private ArrayList<ShipmentLegRateDetail> shipmentLegRateDetails;
    private int dimDivisor;
    private String rateType;
    private ArrayList<Surcharge> surcharges;
    private double totalSurcharges;
    private TotalBillingWeight totalBillingWeight;
    private ArrayList<FreightDiscount> freightDiscounts;
    private String rateScale;
    private double totalNetCharge;
    private double totalBaseCharge;
    private double totalNetChargeWithDutiesAndTaxes;
    private String currency;

    public String getRateZone() {
        return rateZone;
    }

    public void setRateZone(String rateZone) {
        this.rateZone = rateZone;
    }

    public String getRatedWeightMethod() {
        return ratedWeightMethod;
    }

    public void setRatedWeightMethod(String ratedWeightMethod) {
        this.ratedWeightMethod = ratedWeightMethod;
    }

    public double getTotalDutiesTaxesAndFees() {
        return totalDutiesTaxesAndFees;
    }

    public void setTotalDutiesTaxesAndFees(double totalDutiesTaxesAndFees) {
        this.totalDutiesTaxesAndFees = totalDutiesTaxesAndFees;
    }

    public String getPricingCode() {
        return pricingCode;
    }

    public void setPricingCode(String pricingCode) {
        this.pricingCode = pricingCode;
    }

    public double getTotalFreightDiscounts() {
        return totalFreightDiscounts;
    }

    public void setTotalFreightDiscounts(double totalFreightDiscounts) {
        this.totalFreightDiscounts = totalFreightDiscounts;
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }

    public void setTotalTaxes(double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    public double getTotalDutiesAndTaxes() {
        return totalDutiesAndTaxes;
    }

    public void setTotalDutiesAndTaxes(double totalDutiesAndTaxes) {
        this.totalDutiesAndTaxes = totalDutiesAndTaxes;
    }

    public double getTotalAncillaryFeesAndTaxes() {
        return totalAncillaryFeesAndTaxes;
    }

    public void setTotalAncillaryFeesAndTaxes(double totalAncillaryFeesAndTaxes) {
        this.totalAncillaryFeesAndTaxes = totalAncillaryFeesAndTaxes;
    }

    public ArrayList<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(ArrayList<Tax> taxes) {
        this.taxes = taxes;
    }

    public double getTotalRebates() {
        return totalRebates;
    }

    public void setTotalRebates(double totalRebates) {
        this.totalRebates = totalRebates;
    }

    public double getFuelSurchargePercent() {
        return fuelSurchargePercent;
    }

    public void setFuelSurchargePercent(double fuelSurchargePercent) {
        this.fuelSurchargePercent = fuelSurchargePercent;
    }

    public CurrencyExchangeRate getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }

    public void setCurrencyExchangeRate(CurrencyExchangeRate currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
    }

    public double getTotalNetFreight() {
        return totalNetFreight;
    }

    public void setTotalNetFreight(double totalNetFreight) {
        this.totalNetFreight = totalNetFreight;
    }

    public double getTotalNetFedExCharge() {
        return totalNetFedExCharge;
    }

    public void setTotalNetFedExCharge(double totalNetFedExCharge) {
        this.totalNetFedExCharge = totalNetFedExCharge;
    }

    public int getDimDivisor() {
        return dimDivisor;
    }

    public void setDimDivisor(int dimDivisor) {
        this.dimDivisor = dimDivisor;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public ArrayList<Surcharge> getSurcharges() {
        return surcharges;
    }

    public void setSurcharges(ArrayList<Surcharge> surcharges) {
        this.surcharges = surcharges;
    }

    public double getTotalSurcharges() {
        return totalSurcharges;
    }

    public void setTotalSurcharges(double totalSurcharges) {
        this.totalSurcharges = totalSurcharges;
    }

    public TotalBillingWeight getTotalBillingWeight() {
        return totalBillingWeight;
    }

    public void setTotalBillingWeight(TotalBillingWeight totalBillingWeight) {
        this.totalBillingWeight = totalBillingWeight;
    }

    public ArrayList<FreightDiscount> getFreightDiscounts() {
        return freightDiscounts;
    }

    public void setFreightDiscounts(ArrayList<FreightDiscount> freightDiscounts) {
        this.freightDiscounts = freightDiscounts;
    }

    public String getRateScale() {
        return rateScale;
    }

    public void setRateScale(String rateScale) {
        this.rateScale = rateScale;
    }

    public double getTotalNetCharge() {
        return totalNetCharge;
    }

    public void setTotalNetCharge(double totalNetCharge) {
        this.totalNetCharge = totalNetCharge;
    }

    public double getTotalBaseCharge() {
        return totalBaseCharge;
    }

    public void setTotalBaseCharge(double totalBaseCharge) {
        this.totalBaseCharge = totalBaseCharge;
    }

    public double getTotalNetChargeWithDutiesAndTaxes() {
        return totalNetChargeWithDutiesAndTaxes;
    }

    public void setTotalNetChargeWithDutiesAndTaxes(double totalNetChargeWithDutiesAndTaxes) {
        this.totalNetChargeWithDutiesAndTaxes = totalNetChargeWithDutiesAndTaxes;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
