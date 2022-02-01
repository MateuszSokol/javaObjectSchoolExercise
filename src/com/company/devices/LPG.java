package com.company.devices;

public class LPG extends Car{
    String carType;
    public LPG(String producer, String model, int prodYear, Double value,String carType) {
        super(producer, model, prodYear, value);
        this.carType = carType;
    }

    @Override
    public void refuel() {

    }
}
