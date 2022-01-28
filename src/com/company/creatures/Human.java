package com.company.creatures;

import com.company.devices.Car;

public class Human {
    public String firstName;
    public String lastName;
    public Integer age;
    private Double salary;
    Animal pet;
    private Car car;


    public void introduceYourself() {
        System.out.println("Moje imie: " + firstName);
        System.out.println("Moje nazwisko " + lastName);
    }



    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Nie mozesz dac ujemnego wynagrodzenia, bez przesady");
        } else {
            System.out.println("nowe dane zostaly wyslane do systemu ksiegowego" + "\n" +
                    " konieczności odebrania aneksu do umowy od pani Hani z kadr" + "\n" +
                    "ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = salary;
        }
    }




    public void setCar(Car car) {
        if (salary > car.getValue()) {
            System.out.println("Kupiles samochod za gotowke");

            this.car = car;
        } else if (salary > car.getValue() / 12.0) {
            System.out.println("Kupiles samochod na kredyt, powodzenia ze splata");
            this.car = car;

        } else {
            System.out.println("Powinienies sie doedukowac, nie masz pieniedzy");
        }
    }

    public String toString(){
        return firstName + " " + lastName + " " + age + " " + salary + " " + pet + " " + car + " ";
    }
    public void setPet(Animal pet){
        this.pet = pet;
    }

}
