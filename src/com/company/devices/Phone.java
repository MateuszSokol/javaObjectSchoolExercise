package com.company.devices;

import com.company.similarToAnimals.Sellable;
import com.company.similarToAnimals.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Sellable {

    int screenSize;
    String os;
    boolean isOn;
    private static final String DEFAULT_SERVER_ADDRESS ="wsb.pl";
    private static final String DEFAULT_PROTOCOL = "HTTP";
    private static final String DEFAULT_VERSION_NAME = "Version 163812";

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
    public void installAnnApp(String appName){
this.installAnnApp(appName,DEFAULT_VERSION_NAME);
    }
    public void installAnnApp(String appName,String version){
        this.installAnnApp(appName,version,DEFAULT_SERVER_ADDRESS);

    }
    public void installAnnApp(String appName,String version,String serverAddress){
        try{
            URL url = new URL(DEFAULT_PROTOCOL,serverAddress,420,appName+ "-"+version);
            this.installAnnApp(url);
        }catch (MalformedURLException e){
            System.out.println("cos poszlo nie tak");
            e.printStackTrace();
        }


    }
    public void installAnApp(List<String> appNames){
        for (String apps:appNames
             ) {
            this.installAnnApp(apps);
        }
    }
    public void installAnnApp(URL url){
        System.out.println("Instalowanie aplikacji z podanego adresu URL: "+ url);

    }
}
