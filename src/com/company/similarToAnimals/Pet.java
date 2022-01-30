package com.company.similarToAnimals;

import com.company.similarToAnimals.Edible;
import com.company.similarToAnimals.Animal;

public class Pet extends Animal {
    String accurateType;

    public Pet(String species, Double weight, String accurateType){
        super(species,weight);
        this.accurateType = accurateType;

    }


}
