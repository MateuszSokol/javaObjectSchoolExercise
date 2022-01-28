package com.company.devices;

public class Phone extends Device {

    int screenSize;
    String os;

    public Phone(String producer, String model, int prodYear,int screenSize,String os)
    {
        super(producer, model, prodYear);
        this.screenSize = screenSize;
        this.os = os;
    }



    public String toString(){
        return producer + " " + model + " " + screenSize + " " + os + " ";
    }

    @Override
    public void turnOn() {

        System.out.println("Urzadzenie wlaczone");
    }
}
