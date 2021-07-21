package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class ReturnDetail {
    private String authorizationName;
    private ArrayList<ReasonDetail> reasonDetail;

    public String getAuthorizationName() {
        return authorizationName;
    }

    public void setAuthorizationName(String authorizationName) {
        this.authorizationName = authorizationName;
    }

    public ArrayList<ReasonDetail> getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(ArrayList<ReasonDetail> reasonDetail) {
        this.reasonDetail = reasonDetail;
    }
}
