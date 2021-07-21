package com.GS.shipperIntegration.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class CustomsClearanceDetail {
    private boolean isDocumentOnly;
    private DutiesPayment dutiesPayment;
    private CommercialInvoice commercialInvoice;
    private ArrayList<Commodities> commodities;

    @JsonProperty("isDocumentOnly")
    public boolean isDocumentOnly() {
        return isDocumentOnly;
    }

    public void setIsDocumentOnly(boolean isDocumentOnly) {
        this.isDocumentOnly = isDocumentOnly;
    }

    public DutiesPayment getDutiesPayment() {
        return dutiesPayment;
    }

    public void setDutiesPayment(DutiesPayment dutiesPayment) {
        this.dutiesPayment = dutiesPayment;
    }

    public CommercialInvoice getCommercialInvoice() {
        return commercialInvoice;
    }

    public void setCommercialInvoice(CommercialInvoice commercialInvoice) {
        this.commercialInvoice = commercialInvoice;
    }

    public ArrayList<Commodities> getCommodities() {
        return commodities;
    }

    public void setCommodities(ArrayList<Commodities> commodities) {
        this.commodities = commodities;
    }
}
