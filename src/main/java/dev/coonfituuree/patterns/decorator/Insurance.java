package dev.coonfituuree.patterns.decorator;

import dev.coonfituuree.model.CarItem;

public class Insurance extends CarOptionDecorator {

    public Insurance(CarItem base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " + Insurance";
    }

    @Override
    public double getCost() {
        return base.getCost() + 0.5;
    }
}
