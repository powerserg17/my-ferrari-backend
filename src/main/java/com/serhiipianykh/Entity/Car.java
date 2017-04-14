package com.serhiipianykh.Entity;

import org.springframework.data.annotation.Id;

/**
 * Created by serhiipianykh on 2017-04-14.
 */
public class Car {

    @Id
    private String id;
    private String clientId;
    private String vin;
    private String model;

    public Car(String clientId, String vin, String model) {
        this.clientId = clientId;
        this.vin = vin;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
