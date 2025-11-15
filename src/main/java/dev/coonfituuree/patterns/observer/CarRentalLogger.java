package dev.coonfituuree.patterns.observer;

public class CarRentalLogger implements CarObserver {

    @Override
    public void onCarCreated(String type) {
        System.out.println("Car created: " + type);
    }
}
