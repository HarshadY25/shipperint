package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class ShipmentDocuments {
    private String contentKey;
    private int copiesToPrint;
    private enum contentType {
       LABEL, BILL_OF_LADING, GAA_FORM,
       HAZMAT_LABEL, END_OF_DAY_HAZMAT_REPORT,
       MANIFEST_REPORT, MULTIWEIGHT_REPORT,
       MERGED_LABEL_DOCUMENTS, AUXILIARY, RETURN_INSTRUCTIONS,
       ACCEPTANCE_LABEL, COMMERCIAL_INVOICE, PROFORMA_INVOICE,
       USMCA_CERTIFICATION_OF_ORIGIN, CERTIFICATE_OF_ORIGIN ;
    }
    private String serviceCategory;
    private String trackingNumber;
    private String docType;
    private ArrayList<Alerts> alerts;
    private String encodedLabel;
    private String url;
    private String contentType;

    public String getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentKey() {
        return contentKey;
    }

    public void setContentKey(String contentKey) {
        this.contentKey = contentKey;
    }

    public int getCopiesToPrint() {
        return copiesToPrint;
    }

    public void setCopiesToPrint(int copiesToPrint) {
        this.copiesToPrint = copiesToPrint;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public ArrayList<Alerts> getAlerts() {
        return alerts;
    }

    public void setAlerts(ArrayList<Alerts> alerts) {
        this.alerts = alerts;
    }

    public String getEncodedLabel() {
        return encodedLabel;
    }

    public void setEncodedLabel(String encodedLabel) {
        this.encodedLabel = encodedLabel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ShipmentDocuments{" +
                "contentKey='" + contentKey + '\'' +
                ", copiesToPrint=" + copiesToPrint +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", docType='" + docType + '\'' +
                ", alerts=" + alerts +
                ", encodedLabel='" + encodedLabel + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
