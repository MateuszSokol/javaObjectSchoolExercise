package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Car;
import com.company.creatures.Human;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("canis");


        dog.name ="Józek";
        System.out.println("dog name: "+dog.name);
        dog.feed();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
dog.feed();

        Animal cat = new Animal("fenis");
        cat.name = "Koteczek";
        System.out.println("cat name: "+ cat.name);
        System.out.println("cat weight : "+ cat.getWeight());
        cat.takeForWalk();
        cat.takeForWalk();
        cat.feed();
        Car myFirstCar = new Car(2020,"Honda","Civic");
        Human me = new Human("Mateusz","Sokol",22,10000.20,cat,myFirstCar);




        me.introduceYourself();
        //Human myWife = new Human("Andzela","Sasik",18,0.0,dog,);
        //myWife.introduceYourself();

        Car yoursCar = new Car(2010, "Renault", "Clio");

    }
}
