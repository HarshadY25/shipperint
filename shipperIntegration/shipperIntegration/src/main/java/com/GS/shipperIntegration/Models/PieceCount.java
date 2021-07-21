package com.GS.shipperIntegration.Models;

public class PieceCount {
    private String count;
    private String type;
    private String description;
    private enum type {
        DESTINATION, ORIGIN
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
