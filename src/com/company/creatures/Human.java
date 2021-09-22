package com.company.creatures;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Double salary;
    Animal pet;

    public Human(String firstName, String lastName, Integer age, Double salary,Animal pet) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.pet = pet;
    }

    public void introduceYourself() {
        System.out.println("My name: "+firstName);
        System.out.println("My last name: "+lastName);
    }
}
