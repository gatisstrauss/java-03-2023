package io.codelex.oop.summary;

import java.time.LocalDate;

public class HouseholdItem extends AbstractItem {
    private final String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String getFullInfo() {
        return String.format("%s, %.2f EUR, color: %s", getName(), getPrice(), color);
    }

    @Override
    public LocalDate getExpirationDate() {
        return null;
    }
}
