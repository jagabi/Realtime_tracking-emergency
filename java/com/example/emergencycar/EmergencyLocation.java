package com.example.emergencycar;

public class EmergencyLocation
{
    private double latitude = 0.0;
    private double longitude = 0.0;
    private String uid ;

    public EmergencyLocation() { }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
