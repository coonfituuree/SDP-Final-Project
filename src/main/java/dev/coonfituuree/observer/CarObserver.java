package dev.coonfituuree.observer;

import dev.coonfituuree.carBuilder.Car;

public interface CarObserver {
    void onCarRented(String carType);
}
