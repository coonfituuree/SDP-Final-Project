package dev.coonfituuree.carFactory.carTypes;

import dev.coonfituuree.carFactory.interfaces.ICar;

public class LuxuryCar implements ICar {
    @Override
    public void showInfo() {
        System.out.println("Luxury Car");
    }
}
