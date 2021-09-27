package com.company.devices;

public class Phone {
    final String prodcuer;
    final String model;
   final Double screenSize;
    String os;

    public Phone(String prodcuer, String model, Double screenSize,String os) {
        this.prodcuer = prodcuer;
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
    }
    public String toString(){
        return prodcuer + " " + model + " " + screenSize + " " + os + " ";
    }
}
