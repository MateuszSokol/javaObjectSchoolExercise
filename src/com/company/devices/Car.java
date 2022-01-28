package com.company.devices;

import java.util.Objects;

public class Car extends Device {
    Double value;

    public Car(String producer, String model, int prodYear,Double value) {
        super(producer, model, prodYear);
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Urzadzenie wlaczone, mozna jechac");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return prodYear == car.prodYear && producer.equals(car.producer) && model.equals(car.model)
                && Objects.equals(value, car.value);
    }
    public String toString(){
        return prodYear + " " +producer +" " +model + " " + value + " ";
    }
    public Double getValue(){
        return  value;
    }


}
