package com.company.similarToAnimals;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;
import java.util.Date;

public class Human implements Sellable{
    public String firstName;
    public String lastName;
    public Integer age;
    private Double salary;
    Animal pet;
public Car [] garage;
    private double cash;
    Phone phone;


    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Human(String firstName,String lastName,Integer garageSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garageSize];
    }

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



    public void setCar(Human owner,Integer parkingSpot,Car car) {
        if (salary > car.getValue()) {
            System.out.println("Kupiles samochod za gotowke");
            car.setCarOwners(owner);

            owner.garage[parkingSpot] =car;
        } else if (salary > car.getValue() / 12.0) {
            System.out.println("Kupiles samochod na kredyt, powodzenia ze splata");
            owner.garage[parkingSpot] =car;

        } else {
            System.out.println("Powinienies sie doedukowac, nie masz pieniedzy");
        }
    }

    public String toString(){
        return firstName + " " + lastName + " " + age + " " + salary + " " + pet + " " + Arrays.toString(garage) + " ";
    }
    public void setPet(Animal pet){
        this.pet = pet;
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

    public void addCarToFreeSpot(Human buyer,Human seller,Integer sellerCarSpot) {
        for (int i = 0; i < buyer.garage.length; i++) {
            if(buyer.garage[i] == null) {
                buyer.garage[i] = seller.garage[sellerCarSpot];
                break;
            }

        }

    }

    public Integer returnCarSpotInGarage(Human seller){

        int a = 0;
        for (int i = 0; i < seller.garage.length; i++) {
            if(seller.garage[i] != null) {
                a = i;
                break;
            }

        }
        return a;
    }
    public boolean isGarageSellerNotNull(Human seller,Integer spot){
        boolean isFree = false;
        if(seller.garage[spot] !=null){
            isFree = true;
        }
        return isFree;
    }

    public boolean isFreeSpotInBuyerGarage(Human buyer){

        boolean isFree = false;
        for (Car car:
                buyer.garage) {
            if(car ==null){
                isFree= true;
                break;
            }
        }
        return isFree;
    }

    public void removeCarFromSellerSpot(Human seller,Integer spot){
        seller.garage[spot] = null;
    }
    public Double getCarsInGarageValue(Human human){
        double value = 0;

        for (int i = 0; i <human.garage.length ; i++) {
            if(human.garage[i] != null)
            value +=human.garage[i].getValue();
        }
        return  value;
    }

    public void sortCarsByProdYear(Human owner){
        Car temp;
        for (int i = 0; i < owner.garage.length; i++) {

                if(garage[i] != null && garage[i+1] != null && garage[i].getProdYear()>garage[i+1].getProdYear()){
                    temp = garage[i+1];
                    garage[i+1] = garage[i];
                    garage[i] = temp;
                }

        }
    }
}
