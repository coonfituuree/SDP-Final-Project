package dev.coonfituuree.patterns.facade;

import dev.coonfituuree.model.CarItem;
import dev.coonfituuree.patterns.decorator.BabySeat;
import dev.coonfituuree.patterns.decorator.GPS;
import dev.coonfituuree.patterns.decorator.Insurance;
import dev.coonfituuree.patterns.factory.CarFactory;
import dev.coonfituuree.patterns.strategy.PaymentStrategy;

import java.util.List;

public class CarRentalFacade {
    public void rentCar(String type, int days, List<String> opts, PaymentStrategy payStrat){
        CarItem c = (CarItem) CarFactory.createCar(type);

        for (String o : opts) {
            switch (o.toLowerCase()){
                case "gps" -> c =new GPS(c);
                case "babyseat" -> c =new BabySeat(c);
                case "insurance" -> c = new Insurance(c);
            }
        }

        double totalCost = c.getCost() * days;

        System.out.println("Car: " + c.getDescription());
        System.out.println("Expired Day: " + days + ", TotalCost: " + totalCost + "$");

        payStrat.pay(totalCost);
    }
}
