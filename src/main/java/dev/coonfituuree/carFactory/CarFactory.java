package dev.coonfituuree.carFactory;

import dev.coonfituuree.carBuilder.Car;
import dev.coonfituuree.carFactory.carTypes.EconomyCar;
import dev.coonfituuree.carFactory.carTypes.LuxuryCar;
import dev.coonfituuree.carFactory.carTypes.SUVCar;

public class CarFactory {
    public static Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "economy" -> new EconomyCar();
            case "luxury" -> new LuxuryCar();
            case "suv" -> new SUVCar();
            default -> throw new IllegalArgumentException("Unknown car type: " + type);
        };
    }
}
