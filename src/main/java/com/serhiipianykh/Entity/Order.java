package com.serhiipianykh.Entity;

import org.springframework.data.annotation.Id;

/**
 * Created by serhiipianykh on 2017-04-14.
 */
public class Order {

    @Id
    private String id;
    private String carId;
    private String clientId;
    private String location;
    private long datetimeOn;
    private long datetimeOff;


    public Order(String carId, String clientId, String location, long datetimeOn, long datetimeOff) {
        this.carId = carId;
        this.location = location;
        this.datetimeOn = datetimeOn;
        this.datetimeOff = datetimeOff;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getDatetimeOn() {
        return datetimeOn;
    }

    public void setDatetimeOn(long datetimeOn) {
        this.datetimeOn = datetimeOn;
    }

    public long getDatetimeOff() {
        return datetimeOff;
    }

    public void setDatetimeOff(long datetimeOff) {
        this.datetimeOff = datetimeOff;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
