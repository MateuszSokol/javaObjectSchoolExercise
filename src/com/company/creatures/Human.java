package com.company.creatures;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
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

    public Double getSalary() {

        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("You can't add negative salary");
        }else{
            System.out.println("nowe dane zostaly wyslane do systemu ksiegowego"+"\n"+
                    " konieczności odebrania aneksu do umowy od pani Hani z kadr"+"\n"+
                    "ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        }
        this.salary = salary;
    }
}
