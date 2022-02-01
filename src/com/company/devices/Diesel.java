package com.company.devices;

public class Diesel extends Car{
    String carType;
    public Diesel(String producer, String model, int prodYear, Double value,String carType) {
        super(producer, model, prodYear, value);
        this.carType = carType;
    }

    @Override
    public void refuel() {
        System.out.println("Olej napedowy nalany do: " + carType);
    }
}
