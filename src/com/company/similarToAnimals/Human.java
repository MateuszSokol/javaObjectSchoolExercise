package com.company.similarToAnimals;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human implements Sellable{
    public String firstName;
    public String lastName;
    public Integer age;
    private Double salary;
    Animal pet;
    private Car car;
    private double cash;
    Phone phone;
   Double cashBeforePayments;


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

            setCash(getCash()+salary);
        }
    }
    public void getInfoAboutWithdraw(Double salary){
        Date datetime = new Date();
        double cashBefore = this.cash -salary;

        System.out.println("Kwota pensji: "+salary);
        System.out.println("Data ostatnio pobieranych informacji: "+ datetime);
        System.out.println("Stan konta przed dostarczeniem pensji: "+ cashBefore);
    }

    public Double getSalary(){
        return this.salary;
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

    public Car getCar(){
        return this.car;
    }



    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public Animal getPet() {
        return pet;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Zakaz handlu ludzmi");
    }
}
