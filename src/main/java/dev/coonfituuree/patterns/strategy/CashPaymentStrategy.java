package dev.coonfituuree.patterns.strategy;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid in cash payment strategy" + amount);
    }
}
