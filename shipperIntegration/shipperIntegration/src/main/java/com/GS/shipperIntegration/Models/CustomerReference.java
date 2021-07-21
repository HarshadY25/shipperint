package com.GS.shipperIntegration.Models;

public class CustomerReference {
    private enum customerReferenceType {
        CUSTOMER_REFERENCE, DEPARTMENT_NUMBER, INVOICE_NUMBER,
        P_O_NUMBER, INTRACOUNTRY_REGULATORY_REFERENCE, RMA_ASSOCIATION
    }
    private String customerReferenceType;
    private String value;

    public String getCustomerReferenceType() {
        return customerReferenceType;
    }

    public void setCustomerReferenceType(String customerReferenceType) {
        this.customerReferenceType = customerReferenceType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
