package com.company.similarToAnimals;

import com.company.similarToAnimals.Animal;

public class FarmAnimal extends Animal implements Edible{
    String animalProduct;

    public FarmAnimal(String species, Double weight,String animalProduct) {
        super(species, weight);
        this.animalProduct = animalProduct;
    }

    @Override
    public void beEaten() {
        System.out.println("Zjedzony");
    }

    @Override
    public String toString() {
        return "Gatunek: " + species + " Waga: " + getWeight() +" Produkt: "+ animalProduct;

    }


}
