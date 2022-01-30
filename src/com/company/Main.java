package com.company;

import com.company.similarToAnimals.Animal;
import com.company.devices.Car;
import com.company.similarToAnimals.Human;
import com.company.devices.Phone;
import com.company.similarToAnimals.Pet;

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

        Pet cat = new Pet("fenis",3.0,"dachowiec");
        cat.name = "Koteczek";
        System.out.println("Imie kota: "+ cat.name);
        System.out.println("Waga kota : "+ cat.getWeight());
        cat.takeForWalk();
        cat.takeForWalk();
        cat.feed();
        Car myFirstCar = new Car("Renault","Megane",1999,10000.0);
        Human me = new Human();

        me.firstName ="Mateusz";
        me.lastName ="Sokol";
        me.age = 22;
        me.setSalary(1.200);




        me.setCar(myFirstCar);







        me.introduceYourself();
        Human myWife = new Human();
        myWife.age = 25;
        myWife.firstName = "Halina";
        myWife.lastName = "Kapusta";

      //  myWife.introduceYourself();

        Car yoursCar = new Car("Honda","Civic",2000,20000.4);


        myWife.setSalary(300000.1);
        myWife.setCar(yoursCar);

        System.out.println(new Car("Renault","Clio",1998,21000.0).
                equals(new Car("Renault","Clio",1998,21000.0)));
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
            me.getPet().sell(me,myWife,20.0);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //cat.sell(myWife,me,20.0);


    }
}
