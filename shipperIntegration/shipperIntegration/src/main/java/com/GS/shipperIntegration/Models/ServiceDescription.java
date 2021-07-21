package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class ServiceDescription {
    private String serviceType;
    private String code;
    private String serviceCategory;
    private String description;
    private String astraDescription;
    private ArrayList<Names> names;
    private ArrayList<String> operatingOrgCodes;

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAstraDescription() {
        return astraDescription;
    }

    public void setAstraDescription(String astraDescription) {
        this.astraDescription = astraDescription;
    }

    public ArrayList<Names> getNames() {
        return names;
    }

    public void setNames(ArrayList<Names> names) {
        this.names = names;
    }

    public ArrayList<String> getOperatingOrgCodes() {
        return operatingOrgCodes;
    }

    public void setOperatingOrgCodes(ArrayList<String> operatingOrgCodes) {
        this.operatingOrgCodes = operatingOrgCodes;
    }
}
