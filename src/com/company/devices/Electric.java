package com.company.devices;

public class Electric extends Car{
    String carType;
    public Electric(String producer, String model, int prodYear, Double value,String carType) {

        super(producer, model, prodYear, value);
        this.carType = carType;
    }

    @Override
    public void refuel() {

        System.out.println("Samochod naladowny" + carType);
    }
}
