package com.company.similarToAnimals;

public interface Sellable {
    public void sell(Human seller, Human buyer,Double price) throws InterruptedException;
}
