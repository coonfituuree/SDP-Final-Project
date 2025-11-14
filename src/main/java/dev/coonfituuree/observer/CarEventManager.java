package dev.coonfituuree.observer;

import java.util.ArrayList;
import java.util.List;

public class CarEventManager {
    private final List<CarObserver> observers = new ArrayList<>();

    public void subscribe(CarObserver observer) {
        observers.add(observer);
    }

    public void notify(String carType) {
        for (CarObserver obs : observers) {
            obs.onCarRented(carType);
        }
    }
}
