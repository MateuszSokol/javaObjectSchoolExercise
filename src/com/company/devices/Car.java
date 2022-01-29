package com.company.devices;

import com.company.Sellable;
import com.company.creatures.Human;

import java.util.Objects;

public class Car extends Device implements Sellable  {
    Double value;
    boolean isOn;

    public Car(String producer, String model, int prodYear,Double value) {
        super(producer, model, prodYear);
        this.value = value;
    }

    @Override
    public void turnOn() {
        isOn = true;
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

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", isOn=" + isOn +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", prodYear=" + prodYear +
                '}';
    }

    public Double getValue(){
        return  value;
    }


    @Override
    public void sell(Human seller,Human buyer,Double cash) throws InterruptedException {
        System.out.println("Samochod sprzedajacego: "+seller.getCar());
        System.out.println("Samochod kupujacy: "+buyer.getCar());
        System.out.println("Stan konta przed kupnem"+"\n"
                +"Kupujacy: "+buyer.getCash() +"\n"+ " Sprzedajacy: "+seller.getCash());
        System.out.println("Transakcja trwa...");
        Thread.sleep(2000);
        if(seller.getCar() != null && buyer.getCash()>=cash){
            seller.setCash(seller.getCash()+cash);
            buyer.setCash(buyer.getCash()-cash);
            buyer.setCar(seller.getCar());
            seller.setCar(null);
            System.out.println("Stan konta po zakupie"+"\n"+
                    "Kupujacy: "+buyer.getCash()+"\n"+" Sprzedajacy: "+seller.getCash());
            System.out.println("Samochod sprzedajacego: "+seller.getCar());
            System.out.println("Samochod kupujacy: "+buyer.getCar());


        }else{
            System.out.println("Nie masz pieniedzy albo samochodu"+seller.getCar()+"/"+seller.getCash());

        }
    }

}
