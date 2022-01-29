package com.company.creatures;

import com.company.Sellable;

public class Animal implements Sellable {
    public String species;
    private Double weight;
    public String name;

    public Double getWeight() {
        return weight;
    }

    public Animal(String species) {

        this.species = species;


        if (species.equals("canis")) {
            this.weight = 10.0;
        } else if (species.equals("fenis")) {
            this.weight = 5.0;
        }


    }

    public void feed() {
        if (this.weight > 0) {

            this.weight += 5;
            System.out.println("Waga: " + weight);
        } else if (this.weight <= 0) {
            System.out.println("Nie mozesz nakarmic martwego zwierzaka " + species);
            System.out.println("Waga: " + weight);
        }
    }

    public void takeForWalk() {
        if (this.weight > 0) {

            this.weight -= 5;
            System.out.println("Waga: " + weight);
        } else if (this.weight <= 0) {
            System.out.println("Nie mozesz wziac na spacer martwego zwierza " + species);
            System.out.println("Waga: " + weight);
        }

    }

    public String toString() {
        return species + " " + weight + " " + name + " ";
    }

    @Override
    public void sell(Human seller,Human buyer,Double cash) throws InterruptedException {
        System.out.println("Zwierze sprzedajacego: "+seller.getPet());
        System.out.println("Zwierzak sprzedajacego: "+buyer.getPet());

        System.out.println("Stan konta przed kupnem"+"\n"
                +"Kupujacy: "+buyer.getCash() +"\n"+ " Sprzedajacy: "+seller.getCash());

        System.out.println("Transakcja trwa...");
        Thread.sleep(2000);
        if(seller.getPet() != null && buyer.getCash()>=cash){
            seller.setCash(seller.getCash()+cash);
            buyer.setCash(buyer.getCash()-cash);
            buyer.setPet(seller.getPet());
            seller.setPet(null);
            System.out.println("Stan konta po zakupie"+"\n"+
                    "Kupujacy: "+buyer.getCash()+"\n"+" Sprzedajacy: "+seller.getCash());
            System.out.println("Zwierzak sprzedajacego: "+seller.getPet());
            System.out.println("Zwierzak kupujacego: "+buyer.getPet());


        }else{
            System.out.println("Nie masz pieniedzy lub zwierzaka"+seller.getPet()+"/"+seller.getCash());
        }
    }

}
