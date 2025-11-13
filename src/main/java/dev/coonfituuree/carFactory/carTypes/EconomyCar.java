package dev.coonfituuree.carFactory.carTypes;

import dev.coonfituuree.carFactory.interfaces.ICar;

public class EconomyCar implements ICar {
    @Override
    public void showInfo() {
        System.out.println("Economy Car");
    }
}
