package io.codelex.oop.summary;

import java.time.LocalDate;

public class ElectronicsItem extends AbstractItem {
    private final int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public String getFullInfo() {
        return String.format("%s, %.2f EUR, power: %dW", getName(), getPrice(), power);
    }

    @Override
    public LocalDate getExpirationDate() {
        return null;
    }
}
