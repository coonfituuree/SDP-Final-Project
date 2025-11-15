package dev.coonfituuree.patterns.carFactory.carTypes;

import dev.coonfituuree.patterns.carFactory.interfaces.ICar;

public class SUVCar implements ICar {
    @Override
    public void showInfo() {
        System.out.println("SUV Car");
    }
}
