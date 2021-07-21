package com.GS.shipperIntegration.Models;

public class FedExRequestBody {
    private RequestedShipment requestedShipment;
    private enum labelResponseOptions {
        URL_ONLY, LABEL
    }
    private AccountNumber accountNumber;
    private enum shipAction {
        CONFIRM, TRANSFER
    }
    private enum processingOptionType {
        SYNCHRONOUS_ONLY, ALLOW_ASYNCHRONOUS
    }
    private boolean oneLabelAtATime;
}
