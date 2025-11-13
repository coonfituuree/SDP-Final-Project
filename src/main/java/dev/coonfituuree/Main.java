package dev.coonfituuree;

import dev.coonfituuree.carBuilder.Car;

public class Main {
    public static void main(String[] args) {




        //Builder Pattern
        Car car = new Car.CarBuilder()
                .setBrand("Toyota")
                .setModel("Camry")
                .setYear(2022)
                .setColor("Black")
                .setType("Sedan")
                .setTransmission("Automatic")
                .setFuelType("Hybrid")
                .build();

        System.out.println(car);
    }
}