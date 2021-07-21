package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class OperationalDetail {
    private String astraHandlingText;
    private Barcodes barcodes;
    private ArrayList<OperationalInstruction> operationalInstructions;

    public String getAstraHandlingText() {
        return astraHandlingText;
    }

    public void setAstraHandlingText(String astraHandlingText) {
        this.astraHandlingText = astraHandlingText;
    }

    public Barcodes getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(Barcodes barcodes) {
        this.barcodes = barcodes;
    }

    public ArrayList<OperationalInstruction> getOperationalInstructions() {
        return operationalInstructions;
    }

    public void setOperationalInstructions(ArrayList<OperationalInstruction> operationalInstructions) {
        this.operationalInstructions = operationalInstructions;
    }
}
