package com.company.creatures;

public class Animal {
    public String species;
    private Double weight;
    public String name;

    public Double getWeight() {
        return weight;
    }

    public Animal(String species) {

        this.species = species;


        if (species.equals("canis")) {
            this.weight = 10.0;
        } else if (species.equals("fenis")) {
            this.weight = 5.0;
        }


    }

    public void feed() {
        if (this.weight > 0) {

            this.weight += 5;
            System.out.println("weight: " + weight);
        } else if (this.weight <= 0) {
            System.out.println("You can't feed dead animal " + species);
            System.out.println("weight: " + weight);
        }
    }

    public void takeForWalk() {
        if (this.weight > 0) {

            this.weight -= 5;
            System.out.println("weight: " + weight);
        } else if (this.weight <= 0) {
            System.out.println("you can't take walk with dead animal " + species);
            System.out.println("weight: " + weight);
        }

    }

    public String toString() {
        return species + " " + weight + " " + name + " ";
    }

}
