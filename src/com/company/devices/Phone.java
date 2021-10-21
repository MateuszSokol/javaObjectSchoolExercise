package com.company.devices;

public class Phone {
    final String producer;
    final String model;
   final Double screenSize;
    String os;

    public Phone(String producer, String model, Double screenSize,String os) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
    }
    public String toString(){
        return producer + " " + model + " " + screenSize + " " + os + " ";
    }
}
