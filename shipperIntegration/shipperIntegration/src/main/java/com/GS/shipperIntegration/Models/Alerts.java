package com.GS.shipperIntegration.Models;

public class Alerts {
    private String code;
    private String alertType;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Alerts{" +
                "code='" + code + '\'' +
                ", alertType='" + alertType + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
