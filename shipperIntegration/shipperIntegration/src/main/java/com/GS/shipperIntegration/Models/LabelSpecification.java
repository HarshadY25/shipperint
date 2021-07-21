package com.GS.shipperIntegration.Models;

public class LabelSpecification {

    // TO DO:  Add (ShippingDocumentImageType.PDF)
    //                      (LabelFormatType.COMMON2D)
    private String imageType = "PDF";
    private String labelStockType = "PAPER_4X6";

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getLabelStockType() {
        return labelStockType;
    }

    public void setLabelStockType(String labelStockType) {
        this.labelStockType = labelStockType;
    }

    public LabelSpecification(String imageType, String labelStockType) {
        this.imageType = imageType;
        this.labelStockType = labelStockType;
    }
}
