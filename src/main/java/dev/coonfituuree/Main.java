package dev.coonfituuree;

import dev.coonfituuree.patterns.carBuilder.Car;
import dev.coonfituuree.patterns.carFactory.CarFactory;
import dev.coonfituuree.patterns.carFactory.interfaces.ICar;
import dev.coonfituuree.patterns.observer.CarRentalLogger;

public class Main {

    public static void main(String[] args) {

        CarFactory.addObserver(new CarRentalLogger());

        ICar car1 = CarFactory.createCar("economy");
        ICar car2 = CarFactory.createCar("luxury");

        car1.showInfo();
        car2.showInfo();

        Car myEconomy = CarFactory.getPreset("economy")
                .setColor("Red")
                .setYear(2024)
                .setFuelType("Petrol")
                .build();

        Car mySUV = CarFactory.getPreset("suv")
                .setColor("Black")
                .setYear(2023)
                .setTransmission("Manual")
                .build();

        System.out.println(myEconomy);
        System.out.println(mySUV);
    }
}
