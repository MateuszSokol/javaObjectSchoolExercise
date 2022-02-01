package com.company.similarToAnimals;

import com.company.similarToAnimals.Human;
import com.company.similarToAnimals.Sellable;

public abstract class Animal implements Sellable ,Feedable{
    final String species;
    private Double weight;
    public String name;
     private final Double DEFAULT_FOOD_WEIGHT = 1.0;
    private final Double DEFAULT_WALK_LOSE_WEIGHT = 2.0;

    public Double getWeight() {
        return weight;
    }

    public Animal(String species,Double weight) {

        this.species = species;

        this.weight = weight;

        if (species.equals("canis")) {
            this.weight = 10.0;
        } else if (species.equals("fenis")) {
            this.weight = 15.0;
        }


    }


    @Override
    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double FoodWeight) {
        if (this.weight > 0) {

            this.weight += FoodWeight;
            System.out.println("Waga: " + weight);
        } else if (this.weight <= 0) {

            System.out.println("Nie mozesz nakarmic martwego zwierzaka " + species);
            System.out.println("Waga: " + weight);
        }
    }

    public void takeForWalk() {
        if (this.weight > 0) {

            this.weight -= DEFAULT_WALK_LOSE_WEIGHT;
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
    public void sell(Human seller, Human buyer, Double cash) throws InterruptedException {
        System.out.println("Zwierze sprzedajacego: "+seller.getPet());
        System.out.println("Zwierzak sprzedajacego: "+buyer.getPet());

        System.out.println("Stan konta przed kupnem"+"\n"
                +"Kupujacy: "+buyer.getCash() +"\n"+ " Sprzedajacy: "+seller.getCash());

        System.out.println("Transakcja trwa...");
        Thread.sleep(2000);
        if(seller.getPet() != null && buyer.getCash()>=cash && seller.getPet().getWeight()>0){
            seller.setCash(seller.getCash()+cash);
            buyer.setCash(buyer.getCash()-cash);
            buyer.setPet(seller.getPet());
            seller.setPet(null);
            System.out.println("Stan konta po zakupie"+"\n"+
                    "Kupujacy: "+buyer.getCash()+"\n"+" Sprzedajacy: "+seller.getCash());
            System.out.println("Zwierzak sprzedajacego: "+seller.getPet());
            System.out.println("Zwierzak kupujacego: "+buyer.getPet());


        }else{
            System.out.println("Nie masz pieniedzy lub zwierzaka albo masz martwego zwierza :/" +
                    ""+seller.getPet()+"/"+seller.getCash());
        }
    }

}
