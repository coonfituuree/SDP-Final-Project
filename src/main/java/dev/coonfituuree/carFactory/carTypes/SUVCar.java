package dev.coonfituuree.carFactory.carTypes;

import dev.coonfituuree.carFactory.interfaces.ICar;

public class SUVCar implements ICar {
    @Override
    public void showInfo() {
        System.out.println("SUV Car");
    }
}
