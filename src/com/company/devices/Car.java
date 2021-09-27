package com.company.devices;

import java.util.Objects;

public class Car {
    final Integer prodYear;
    final String producer;
    final String model;
    Double value;

    public Car(int year, String producer, String model, Double value) {
        this.prodYear = year;
        this.producer = producer;
        this.model = model;
        this.value = value;

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
        return prodYear.equals(car.prodYear) && producer.equals(car.producer) && model.equals(car.model)
                && Objects.equals(value, car.value);
    }
    public String toString(){
        return prodYear + " " +producer +" " +model + " " + value + " ";
    }
    public Double getValue(){
        return  value;
    }

}
