package com.javarush.task.task14.task1417;

/**
 * Created by tab65 on 15.01.2019.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
