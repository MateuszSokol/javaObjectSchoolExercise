package com.company;

import com.company.devices.*;
import com.company.similarToAnimals.Animal;
import com.company.similarToAnimals.FarmAnimal;
import com.company.similarToAnimals.Human;
import com.company.similarToAnimals.Pet;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("canis",14.0,"Labrador");


        dog.name ="Józek";
        System.out.println("imie psa: "+dog.name);
        dog.feed();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
dog.feed();

        Pet cat = new Pet("fenis",1.0,"dachowiec");
        cat.name = "Koteczek";
        System.out.println("Imie kota: "+ cat.name);
        System.out.println("Waga kota : "+ cat.getWeight());
        cat.takeForWalk();
        cat.takeForWalk();
        cat.feed();
        Diesel myFirstCar = new Diesel("Renault","Megane",1999,100.0,"Diesel");

        Human me = new Human("Mateusz","Sokol",5);


        me.age = 22;
        me.setSalary(1000.200);

        me.setCar(me,0,myFirstCar);


        me.introduceYourself();
        Human myWife = new Human("Halina","Kapusta",5);
        myWife.age = 25;


      //  myWife.introduceYourself();

        LPG yoursCar = new LPG("Fiat","125p",2000,20000.4,"Gaz");


        myWife.setSalary(300000.1);
        myWife.setCar(myWife,0,yoursCar);

        System.out.println(new LPG("Renault","Clio",1998,21000.0,"Diesel").
                equals(new LPG("Renault","Clio",1998,21000.0,"Diesel")));
        Phone myPhone = new Phone("Apple","12",2018,12,"iOS");
        Phone wifePhone = new Phone("Samsung","A122",2021,10,"Android");
        me.setPet(cat);
        myWife.setPet(dog);
        me.setPhone(myPhone);
        myWife.setPhone(wifePhone);

        System.out.println(myFirstCar);
        System.out.println(yoursCar);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(me);
        System.out.println(myWife);
        System.out.println(me.getPhone());
        System.out.println(myWife.getPhone());

        try {
            me.getPhone().sell(me,myWife,10.0);
            myWife.getPet().sell(myWife,me,20.0);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FarmAnimal chicken = new FarmAnimal("bird",3.15,"mieso");
        System.out.println(chicken);
        //cat.sell(myWife,me,20.0);




   me.getInfoAboutWithdraw(me.getSalary());

        try {
            myFirstCar.sell(me,myWife,2.0);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(myWife);
       myWife.sortCarsByProdYear(myWife);
        System.out.println(myWife);

        System.out.println(myWife.getCarsInGarageValue(myWife));
        Electric electricCar = new Electric("Tesla","S",2020,1000.0,"Electric");
        System.out.println(electricCar);

    }
}
