package io.codelex.oop.summary;

import java.time.LocalDate;


public class FoodItem extends AbstractItem {
    private final LocalDate expirationDate;

    public FoodItem(String name, double price, LocalDate expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getFullInfo() {
        return String.format("%s, %.2f EUR, best before: %s", getName(), getPrice(), expirationDate);
    }
}
