package dev.coonfituuree.patterns.observer;

public class CarRentalLogger implements CarObserver {
    @Override
    public void onCarRented(String carType) {
        System.out.println("INFO: Rented car type: " + carType);
    }
}
