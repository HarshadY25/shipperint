package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class WeightAndDimensions {
    private ArrayList<Weight> dimensionalWeight;
    private ArrayList<Weight> weight;
    private ArrayList<Dimension> dimensions;

    public ArrayList<Weight> getDimensionalWeight() {
        return dimensionalWeight;
    }

    public void setDimensionalWeight(ArrayList<Weight> dimensionalWeight) {
        this.dimensionalWeight = dimensionalWeight;
    }

    public ArrayList<Weight> getWeight() {
        return weight;
    }

    public void setWeight(ArrayList<Weight> weight) {
        this.weight = weight;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(ArrayList<Dimension> dimensions) {
        this.dimensions = dimensions;
    }
}
