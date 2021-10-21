package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.creatures.Human;
import com.company.devices.Phone;

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
        Car myFirstCar = new Car(2020,"Honda","Civic",20000.20);
      //  Car yourCar = new Car(2020,"Honda","Civic",20000.20);
        Human me = new Human();

        me.firstName ="Mateusz";
        me.lastName ="Sokol";
        me.age = 22;
        me.setSalary(10000.200);


        me.setCar(myFirstCar);







        me.introduceYourself();
        Human myWife = new Human();
        myWife.age = 25;
        myWife.firstName = "Halina";
        myWife.lastName = "Kapusta";

      //  myWife.introduceYourself();

        Car yoursCar = new Car(2020, "Honda", "Civic",20000.20);

        myWife.setSalary(300000.1);
        myWife.setCar(yoursCar);

        System.out.println(new Car(2020,"Honda","Civic",20000.20).
                equals(new Car(2020,"Honda","Civic",20000.20)));
        Phone myPhone = new Phone("Apple","6",12.4,"IOS");
        Phone wifePhone = new Phone("Samsung","9",10.5,"Android");
        me.setPet(cat);
        myWife.setPet(dog);

        System.out.println(myFirstCar);
        System.out.println(yoursCar);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(me);
        System.out.println(myWife);
        System.out.println(myPhone);
        System.out.println(wifePhone);


    }
}
