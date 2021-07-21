package com.GS.shipperIntegration.Models;

public class ConsolidationDetail {
    private String timeStamp;
    private String consolidationID;
    private String eventType;
    private int packageCount;
    private ReasonDetail reasonDetail;

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getConsolidationID() {
        return consolidationID;
    }

    public void setConsolidationID(String consolidationID) {
        this.consolidationID = consolidationID;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public int getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(int packageCount) {
        this.packageCount = packageCount;
    }

    public ReasonDetail getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(ReasonDetail reasonDetail) {
        this.reasonDetail = reasonDetail;
    }
}
