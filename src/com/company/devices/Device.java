package com.company.devices;

public abstract class Device {
    final String producer;
    final String model;
    final int prodYear;

    protected Device(String producer, String model, int prodYear) {
        this.producer = producer;
        this.model = model;
        this.prodYear = prodYear;
    }

    public abstract void turnOn();
    public String toString(){
        return producer + " " + model + " " + prodYear;
    }
}
