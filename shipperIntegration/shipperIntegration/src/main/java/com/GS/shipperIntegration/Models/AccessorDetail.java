package com.GS.shipperIntegration.Models;

public class AccessorDetail {
    private String password;
    private String role;
    private String emailLabelUrl;
    private String userId;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmailLabelUrl() {
        return emailLabelUrl;
    }

    public void setEmailLabelUrl(String emailLabelUrl) {
        this.emailLabelUrl = emailLabelUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
