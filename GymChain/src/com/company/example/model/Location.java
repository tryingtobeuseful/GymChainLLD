package com.company.example.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Location {
    private String locality;
    private int pinCode;
    private String state;
    private String country;

    public Location(String locality, int pinCode, String state, String country){
        this.locality = locality;
        this.country = country;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getLocality(){
        return locality;
    }

    public String getState(){
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setState(String state) {
        this.state = state;
    }
}
