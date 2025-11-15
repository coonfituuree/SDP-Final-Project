package dev.coonfituuree.patterns.strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid in card payment strategy" + amount);
    }
}