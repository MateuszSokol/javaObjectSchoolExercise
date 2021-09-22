package com.company.creatures;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Double salary;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, Integer age, Double salary, Animal pet, Car car) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.pet = pet;
        this.car = car;
    }

    public void introduceYourself() {
        System.out.println("My name: " + firstName);
        System.out.println("My last name: " + lastName);
    }
}
