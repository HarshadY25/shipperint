package com.GS.shipperIntegration.Utils;

import java.util.HashMap;

public class IndiaStateCodes {
    private static final HashMap<String, String> stateCodes = new HashMap<>();

    static {
        stateCodes.put("Andaman & Nicobar", "AN");
        stateCodes.put("Andhra Pradesh", "AP");
        stateCodes.put("Delhi", "DL");
        stateCodes.put("Arunachal Pradesh", "AR");
        stateCodes.put("Assam", "AS");
        stateCodes.put("Bihar", "BR");
        stateCodes.put("Chattisgarh", "CG");
        stateCodes.put("Chandigarh", "CH");
        stateCodes.put("Daman & Diu", "DD");
        stateCodes.put("Dadra and Nagar Haveli", "DN");
        stateCodes.put("Goa", "GA");
        stateCodes.put("Gujarat", "GJ");
        stateCodes.put("Haryana", "HR");
        stateCodes.put("Himachal Pradesh", "HP");
        stateCodes.put("Jammu & Kashmir", "JK");
        stateCodes.put("Jharkhand", "JH");
        stateCodes.put("Karnataka", "KA");
        stateCodes.put("Kerala", "KL");
        stateCodes.put("Lakshdweep", "LD");
        stateCodes.put("Madhya Pradesh", "MP");
        stateCodes.put("Maharashtra", "MH");
        stateCodes.put("Manipur", "MN");
        stateCodes.put("Meghalaya", "ML");
        stateCodes.put("Mizoram", "MZ");
        stateCodes.put("Nagaland", "NL");
        stateCodes.put("Orissa", "OR");
        stateCodes.put("Punjab", "PB");
        stateCodes.put("Puducherry", "PY");
        stateCodes.put("Rajasthan", "RJ");
        stateCodes.put("Sikkim", "SK");
        stateCodes.put("Tamil Nadu", "TN");
        stateCodes.put("Tripura", "TR");
        stateCodes.put("Uttaranchal", "UA");
        stateCodes.put("Uttar Pradesh", "UP");
        stateCodes.put("West Bengal", "WB");
    }

    public static HashMap<String, String> getStateCodes() {
        return stateCodes;
    }
}
