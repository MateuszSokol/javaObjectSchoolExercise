package com.company.devices;

public class Phone extends Device {

    int screenSize;
    String os;
    boolean isOn;

    public Phone(String producer, String model, int prodYear,int screenSize,String os)
    {
        super(producer, model, prodYear);
        this.screenSize = screenSize;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", prodYear=" + prodYear +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }

    @Override
    public void turnOn() {

        isOn = true;
        System.out.println("Urzadzenie wlaczone");
    }
}
