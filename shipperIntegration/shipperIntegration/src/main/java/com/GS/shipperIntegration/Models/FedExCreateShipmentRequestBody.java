package com.GS.shipperIntegration.Models;

public class FedExCreateShipmentRequestBody {
    private RequestedShipment requestedShipment;
    private enum labelResponseOptions {
        URL_ONLY, LABEL
    }
    private AccountNumber accountNumber;
    private String labelResponseOptions;

    public String getLabelResponseOptions() {
        return labelResponseOptions;
    }

    public void setLabelResponseOptions(String labelResponseOptions) {
        this.labelResponseOptions = labelResponseOptions;
    }

    public RequestedShipment getRequestedShipment() {
        return requestedShipment;
    }

    public void setRequestedShipment(RequestedShipment requestedShipment) {
        this.requestedShipment = requestedShipment;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
    }
}
