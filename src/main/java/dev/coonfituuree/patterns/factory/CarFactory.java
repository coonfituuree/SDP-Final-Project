package dev.coonfituuree.patterns.factory;

import dev.coonfituuree.model.Car;
import dev.coonfituuree.model.CarItem;
import dev.coonfituuree.patterns.observer.CarEventManager;
import dev.coonfituuree.patterns.observer.CarObserver;

public class CarFactory {

    private static final CarEventManager events = new CarEventManager();

    public static void addObserver(CarObserver observer) {
        events.subscribe(observer);
    }

    public static CarItem createCar(String type) {
        Car car;

        switch (type.toLowerCase()) {
            case "economy":
                car = new Car.CarBuilder()
                        .setBrand("Toyota")
                        .setModel("Corolla")
                        .setYear(2025)
                        .setColor("White")
                        .setType("Economy")
                        .setTransmission("Automatic")
                        .setFuelType("Gasoline")
                        .build();
                break;

            case "luxury":
                car = new Car.CarBuilder()
                        .setBrand("Mercedes")
                        .setModel("S-Class")
                        .setYear(2025)
                        .setColor("Black")
                        .setType("Luxury")
                        .setTransmission("Automatic")
                        .setFuelType("Gasoline")
                        .build();
                break;

            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }

        events.notify(type);

        return car;
    }
}
