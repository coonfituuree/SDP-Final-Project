package dev.coonfituuree.patterns.factory.types;

import dev.coonfituuree.model.CarItem;

public class EconomyCar implements CarItem {

    @Override
    public String getDescription() {
        return "Economy Car";
    }

    @Override
    public double getCost() {
        return 30; 
    }
}
