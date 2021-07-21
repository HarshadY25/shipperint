package com.GS.shipperIntegration.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FedExAuthRequest {

    @JsonProperty("grant_type")
    private String grant_type;

    @JsonProperty("client_secret")
    private String client_secret;

    @JsonProperty("client_id")
    private String client_id;

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    @Override
    public String toString() {
        return "FedExAuthRequest{" +
                "grant_type='" + grant_type + '\'' +
                ", client_secret='" + client_secret + '\'' +
                ", client_id='" + client_id + '\'' +
                '}';
    }
}
