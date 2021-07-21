package com.GS.shipperIntegration.Models;

public class CurrencyExchangeRate {
    private String rate;
    private String fromCurrency;
    private String intoCurrency;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getIntoCurrency() {
        return intoCurrency;
    }

    public void setIntoCurrency(String intoCurrency) {
        this.intoCurrency = intoCurrency;
    }
}
