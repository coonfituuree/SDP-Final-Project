package dev.coonfituuree.patterns.decorator;

import dev.coonfituuree.model.CarItem;

public class CarOptionDecorator implements CarItem {
    protected final CarItem base;

    public CarOptionDecorator(CarItem base) {
        this.base = base;
    }

    @Override
    public String getDescription() {
        return base.getDescription();
    }

    @Override
    public double getCost() {
        return base.getCost();
    }
}