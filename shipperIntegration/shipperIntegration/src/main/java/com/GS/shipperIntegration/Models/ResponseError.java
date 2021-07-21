package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class ResponseError {
    private String code;
    private String message;
    private ArrayList<ParameterList> parameterList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<ParameterList> getParameterList() {
        return parameterList;
    }

    public void setParameterList(ArrayList<ParameterList> parameterList) {
        this.parameterList = parameterList;
    }
}
