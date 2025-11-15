package dev.coonfituuree.patterns.decorator;

import dev.coonfituuree.model.CarItem;

public class GPS extends CarOptionDecorator {

    public GPS(CarItem base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " + GPS";
    }

    @Override
    public double getCost() {
        return base.getCost() + 10;
    }

}
