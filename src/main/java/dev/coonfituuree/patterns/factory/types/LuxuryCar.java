package dev.coonfituuree.patterns.factory.types;

import dev.coonfituuree.model.CarItem;

public class LuxuryCar implements CarItem {

    @Override
    public String getDescription() {
        return "Luxury Car";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
