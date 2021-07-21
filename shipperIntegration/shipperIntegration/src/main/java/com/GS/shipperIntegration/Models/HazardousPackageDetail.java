package com.GS.shipperIntegration.Models;

import java.util.ArrayList;

public class HazardousPackageDetail {
    private String regulation;
    private String accessibility;
    private String labelType;
    private ArrayList<Containers> containers;
    private boolean cargoAircraftOnly;
    private String referenceId;
    private double radioactiveTransportIndex;
}
