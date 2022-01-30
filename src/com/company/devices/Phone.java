package com.company.devices;

import com.company.similarToAnimals.Sellable;
import com.company.similarToAnimals.Human;

public class Phone extends Device implements Sellable {

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
    @Override
    public void sell(Human seller,Human buyer,Double cash) throws InterruptedException {
        System.out.println("Telefon sprzedajacego: "+seller.getPhone());
        System.out.println("Telefon kupujacy: "+buyer.getPhone());
        System.out.println("Stan konta przed kupnem"+"\n"
        +"Kupujacy: "+buyer.getCash() +"\n"+ " Sprzedajacy: "+seller.getCash());
        System.out.println("Transakcja trwa...");
        Thread.sleep(2000);
        if(seller.getPhone() != null && buyer.getCash()>=cash){
            seller.setCash(seller.getCash()+cash);
            buyer.setCash(buyer.getCash()-cash);
            buyer.setPhone(seller.getPhone());
            seller.setPhone(null);
            System.out.println("Stan konta po zakupie"+"\n"+
                    "Kupujacy: "+buyer.getCash()+"\n"+" Sprzedajacy: "+seller.getCash());
            System.out.println("Telefon sprzedajacego: "+seller.getPhone());
            System.out.println("Telefon kupujacy: "+buyer.getPhone());


        }else{
            System.out.println("Nie masz pieniedzy albo telefonu"+seller.getPhone()+"/"+seller.getCash());
        }
    }
}
