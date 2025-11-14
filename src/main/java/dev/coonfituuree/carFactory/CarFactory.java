package dev.coonfituuree.carFactory;

import dev.coonfituuree.carBuilder.Car;
import dev.coonfituuree.carFactory.carTypes.*;
import dev.coonfituuree.carFactory.interfaces.ICar;
import dev.coonfituuree.observer.CarEventManager;

public class CarFactory {

    private static final CarEventManager events = new CarEventManager();

    public static void addObserver(dev.coonfituuree.observer.CarObserver obs) {
        events.subscribe(obs);
    }

    public static ICar createCar(String type) {

        ICar car = switch (type.toLowerCase()) {
            case "economy" -> new EconomyCar();
            case "luxury" -> new LuxuryCar();
            case "suv" -> new SUVCar();
            default -> throw new IllegalArgumentException("Unknown car type: " + type);
        };

        events.notify(type);

        return car;



    }

    public static Car.CarBuilder getPreset(String type) {

        return switch (type.toLowerCase()) {

            case "economy" -> new Car.CarBuilder()
                    .setBrand("Toyota")
                    .setModel("Corolla")
                    .setType("Economy")
                    .setTransmission("AT");

            case "luxury" -> new Car.CarBuilder()
                    .setBrand("Mercedes")
                    .setModel("S-Class")
                    .setType("Luxury")
                    .setTransmission("AT");

            case "suv" -> new Car.CarBuilder()
                    .setBrand("Toyota")
                    .setModel("RAV4")
                    .setType("SUV")
                    .setTransmission("AT");

            default -> throw new IllegalArgumentException("Unknown preset type: " + type);
        };
    }
}
