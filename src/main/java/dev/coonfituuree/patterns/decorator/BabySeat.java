package dev.coonfituuree.patterns.decorator;

import dev.coonfituuree.model.CarItem;

public class BabySeat extends CarOptionDecorator {

    public BabySeat(CarItem base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " + BabySeat";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }

}