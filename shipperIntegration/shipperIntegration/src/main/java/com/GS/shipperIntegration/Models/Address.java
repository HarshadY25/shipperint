package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class Address {
    private ArrayList<String> streetLines;
    private  String city;
    private  String stateOrProvinceCode;
    private  String postalCode;
    private  String countryCode;

    public ArrayList<String> getStreetLines() {
        return streetLines;
    }

    public void setStreetLines(ArrayList<String> streetLines) {
        this.streetLines = streetLines;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
