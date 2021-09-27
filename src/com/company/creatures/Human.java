package com.company.creatures;

public class Human {
    public String firstName;
    public String lastName;
    public Integer age;
    private Double salary;
    Animal pet;
    private Car car;


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
        } else {
            System.out.println("nowe dane zostaly wyslane do systemu ksiegowego" + "\n" +
                    " konieczności odebrania aneksu do umowy od pani Hani z kadr" + "\n" +
                    "ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        }
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (salary > car.value) {
            System.out.println("You have bought car for cash nice");

            this.car = car;
        } else if (salary > car.value / 12.0) {
            System.out.println("You have bought car for credit Good Luck");
            this.car = car;

        } else {
            System.out.println("You should gain knowledge to have better salary, try matriculate");
        }
    }

    public String toString(){
        return firstName + " " + lastName + " " + age + " " + salary + " " + pet + " " + car + " ";
    }
    public void setPet(Animal pet){
        this.pet = pet;
    }

}
