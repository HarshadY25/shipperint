package com.GS.shipperIntegration.Models;

public class GenerationDetail {
    private String letterhead;
    private String electronicSignature;
    private int minimumCopiesRequired;
    private String type;

    public String getLetterhead() {
        return letterhead;
    }

    public void setLetterhead(String letterhead) {
        this.letterhead = letterhead;
    }

    public String getElectronicSignature() {
        return electronicSignature;
    }

    public void setElectronicSignature(String electronicSignature) {
        this.electronicSignature = electronicSignature;
    }

    public int getMinimumCopiesRequired() {
        return minimumCopiesRequired;
    }

    public void setMinimumCopiesRequired(int minimumCopiesRequired) {
        this.minimumCopiesRequired = minimumCopiesRequired;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
