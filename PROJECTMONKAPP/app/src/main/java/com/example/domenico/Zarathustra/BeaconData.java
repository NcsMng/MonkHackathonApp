package com.example.beacon;

public class BeaconData {
    public final double distance;
    public final PercentagePosition percentagePosition;

    public BeaconData(double distance, PercentagePosition percentagePosition) {
        this.distance = distance;
        this.percentagePosition = percentagePosition;
    }
}
