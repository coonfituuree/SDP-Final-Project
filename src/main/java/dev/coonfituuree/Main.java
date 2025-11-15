package dev.coonfituuree;

import dev.coonfituuree.patterns.factory.CarFactory;
import dev.coonfituuree.patterns.observer.CarRentalLogger;
import dev.coonfituuree.patterns.facade.CarRentalFacade;
import dev.coonfituuree.patterns.strategy.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CarFactory.addObserver(new CarRentalLogger());

        CarRentalFacade f = new CarRentalFacade();

        f.rentCar(
                "economy",
                3,
                Arrays.asList("gps", "insurance"),
                new CardPaymentStrategy()
        );

        System.out.println("-----");

        f.rentCar(
                "luxury",
                1,
                Arrays.asList("babyseat"),
                new CashPaymentStrategy()
        );
    }
}
