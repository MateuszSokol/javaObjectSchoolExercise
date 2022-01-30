package com.company.similarToAnimals;

import com.company.similarToAnimals.Animal;

public class FarmAnimal extends Animal {
    String animalProduct;

    public FarmAnimal(String species, Double weight,String animalProduct) {
        super(species, weight);
        this.animalProduct = animalProduct;
    }
}
