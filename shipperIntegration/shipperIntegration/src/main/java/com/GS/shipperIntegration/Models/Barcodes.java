package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class Barcodes {
    private ArrayList<BinaryBarcode> binaryBarcodes;
    private ArrayList<BinaryBarcode> stringBarcodes;

    public ArrayList<BinaryBarcode> getBinaryBarcodes() {
        return binaryBarcodes;
    }

    public void setBinaryBarcodes(ArrayList<BinaryBarcode> binaryBarcodes) {
        this.binaryBarcodes = binaryBarcodes;
    }

    public ArrayList<BinaryBarcode> getStringBarcodes() {
        return stringBarcodes;
    }

    public void setStringBarcodes(ArrayList<BinaryBarcode> stringBarcodes) {
        this.stringBarcodes = stringBarcodes;
    }
}
