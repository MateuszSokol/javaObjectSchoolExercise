package com.company.devices;

import com.company.similarToAnimals.Sellable;
import com.company.similarToAnimals.Human;

import java.util.Objects;

public abstract class Car extends Device implements Sellable  {

    boolean isOn;

    public Car(String producer, String model, int prodYear,Double value) {
        super(producer, model, prodYear);
        this.value = value;
    }
    public Integer getProdYear(){
        return prodYear;
    }
    public abstract void refuel();
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

        System.out.println("Stan konta przed kupnem"+"\n"
                +"Kupujacy: "+buyer.getCash() +"\n"+ " Sprzedajacy: "+seller.getCash());
        System.out.println("Transakcja trwa...");
        Thread.sleep(2000);

        if(seller.isGarageSellerNotNull(seller,seller.returnCarSpotInGarage(seller)) && buyer.getCash()>=cash&&
                buyer.isFreeSpotInBuyerGarage(buyer)){
            seller.setCash(seller.getCash()+cash);
            buyer.setCash(buyer.getCash()-cash);
            buyer.addCarToFreeSpot(buyer,seller, seller.returnCarSpotInGarage(seller));
            seller.removeCarFromSellerSpot(seller,seller.returnCarSpotInGarage(seller));
            System.out.println("Stan konta po zakupie"+"\n"+
                    "Kupujacy: "+buyer.getCash()+"\n"+" Sprzedajacy: "+seller.getCash());

        }else{
            System.out.println("Nie masz pieniedzy albo samochodu lub kupujacy nie posiada miejsca parkingowego");

        }
    }

}
