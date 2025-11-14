package dev.coonfituuree.carFactory;

import dev.coonfituuree.carBuilder.Car;

public class CarFactory {
    public static Car.CarBuilder createCar(String type) {
        return switch (type.toLowerCase()) {
            case "economy" -> new Car.CarBuilder()
                    .setBrand("Toyota")
                    .setModel("Corolla")
                    .setType("Economy");

            case "luxury" -> new Car.CarBuilder()
                    .setBrand("Mercedes-Benz")
                    .setModel("S-Class")
                    .setType("Luxury");

            case "suv" -> new Car.CarBuilder()
                    .setBrand("Toyota")
                    .setModel("RAV4")
                    .setType("SUV");

            default -> throw new IllegalArgumentException("Unknown car type");
        };
    }

}
