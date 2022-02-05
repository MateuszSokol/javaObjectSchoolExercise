package com.company.devices;

import com.company.Application;
import com.company.similarToAnimals.Sellable;
import com.company.similarToAnimals.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Phone extends Device implements Sellable {

    ArrayList<Application> applications = new ArrayList<>();

    int screenSize;
    String os;
    boolean isOn;
    private static final String DEFAULT_SERVER_ADDRESS = "wsb.pl";
    private static final String DEFAULT_PROTOCOL = "HTTP";
    private static final String DEFAULT_VERSION_NAME = "Version 163812";

    public Phone(String producer, String model, int prodYear, int screenSize, String os) {
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
    public void sell(Human seller, Human buyer, Double cash) throws InterruptedException {
        System.out.println("Telefon sprzedajacego: " + seller.getPhone());
        System.out.println("Telefon kupujacy: " + buyer.getPhone());
        System.out.println("Stan konta przed kupnem" + "\n"
                + "Kupujacy: " + buyer.getCash() + "\n" + " Sprzedajacy: " + seller.getCash());
        System.out.println("Transakcja trwa...");
        Thread.sleep(2000);
        if (seller.getPhone() != null && buyer.getCash() >= cash) {
            seller.setCash(seller.getCash() + cash);
            buyer.setCash(buyer.getCash() - cash);
            buyer.setPhone(seller.getPhone());
            seller.setPhone(null);
            System.out.println("Stan konta po zakupie" + "\n" +
                    "Kupujacy: " + buyer.getCash() + "\n" + " Sprzedajacy: " + seller.getCash());
            System.out.println("Telefon sprzedajacego: " + seller.getPhone());
            System.out.println("Telefon kupujacy: " + buyer.getPhone());


        } else {
            System.out.println("Nie masz pieniedzy albo telefonu" + seller.getPhone() + "/" + seller.getCash());
        }


    }

    public void installAnnApp(String appName) {
        this.installAnnApp(appName, DEFAULT_VERSION_NAME);
    }

    public void installAnnApp(String appName, String version) {
        this.installAnnApp(appName, version, DEFAULT_SERVER_ADDRESS);

    }

    public void installAnnApp(String appName, String version, String serverAddress) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL, serverAddress, 420, appName + "-" + version);
            this.installAnnApp(url);
        } catch (MalformedURLException e) {
            System.out.println("cos poszlo nie tak");
            e.printStackTrace();
        }


    }

    public void installAnApp(List<String> appNames) {
        for (String apps : appNames
        ) {
            this.installAnnApp(apps);
        }
    }

    public void installAnnApp(URL url) {
        System.out.println("Instalowanie aplikacji z podanego adresu URL: " + url);

    }

    public void installApplication(Human phoneOwner, Phone phone, Application app) {
        if (phoneOwner.getCash() >= app.getAppPrice() && phoneOwner.getPhone().equals(phone) && phoneOwner.getPhone() != null) {
            phone.applications.add(app);
            phoneOwner.setCash(phoneOwner.getCash() + app.getAppPrice());
            System.out.println("Aplikacja zainstalowana");

        }else{
            System.out.println("Nie udalo sie zainstalowac aplikacji");
        }


    }

    public boolean isApplicationInstalled(Application application) {

        boolean isInstalled = false;
        for (int i = 0; i < applications.size(); i++) {
            if (applications.get(i).getAppName().equals(application.getAppName())) {
                isInstalled = true;
                break;
            }
        }
        return isInstalled;
    }

    public boolean isApplicationInstalled(String AppName) {
        boolean isInstalled = false;
        for (Application application : applications) {

            if (application.getAppName().equals(AppName)) {
                isInstalled = true;
                break;
            }
        }
        return isInstalled;
    }

    public void printAllFreeApps(Phone phone) {

        String appName = "";
        for (int i = 0; i < phone.applications.size(); i++) {

            if (phone.applications.get(i).getAppPrice() == 0) {
                appName = phone.applications.get(i).getAppName();
                System.out.println("Bezplatna aplikacja: " + appName);
            }

        }
    }

    public Double printApplicationsValue(Phone phone) {

        double value = 0;
        for (int i = 0; i < phone.applications.size(); i++) {
            if (phone.applications.get(i).getAppPrice() != null) {
                value += phone.applications.get(i).getAppPrice();
            }
        }
        return value;
    }

    public void sortListByApplicationName(Phone phone) {

        String[] phoneApps = new String[phone.applications.size()];

        for (int i = 0; i < phoneApps.length; i++) {
            if (phone.applications.get(i) != null) {
                phoneApps[i] = applications.get(i).getAppName();
            }
        }
        Arrays.sort(phoneApps);

        for (String a : phoneApps
        ) {
            System.out.println("Nazwa aplikacji: " + a);
        }

    }

}



