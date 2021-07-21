package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class DocumentRequirements {
    private ArrayList<String> requiredDocuments;
    private ArrayList<String> prohibitedDocuments;
    private ArrayList<GenerationDetail> generationDetails;

    public ArrayList<String> getRequiredDocuments() {
        return requiredDocuments;
    }

    public void setRequiredDocuments(ArrayList<String> requiredDocuments) {
        this.requiredDocuments = requiredDocuments;
    }

    public ArrayList<String> getProhibitedDocuments() {
        return prohibitedDocuments;
    }

    public void setProhibitedDocuments(ArrayList<String> prohibitedDocuments) {
        this.prohibitedDocuments = prohibitedDocuments;
    }

    public ArrayList<GenerationDetail> getGenerationDetails() {
        return generationDetails;
    }

    public void setGenerationDetails(ArrayList<GenerationDetail> generationDetails) {
        this.generationDetails = generationDetails;
    }
}
