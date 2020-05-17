package com.company;

import java.util.Date;

public abstract class Transport {
    private String ownership;
    private String pricce;
    private String id;
    private Date dateofpurchase;
    private String GPSPosition;

    public abstract void  DrivingMethod();

    public abstract void load();

    public abstract void maintain();

    public abstract void addGas();

    public Transport() {
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getPricce() {
        return pricce;
    }

    public void setPricce(String pricce) {
        this.pricce = pricce;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateofpurchase() {
        return dateofpurchase;
    }

    public void setDateofpurchase(Date dateofpurchase) {
        this.dateofpurchase = dateofpurchase;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public Transport(String id) {
        this.id = id;
    }
}
