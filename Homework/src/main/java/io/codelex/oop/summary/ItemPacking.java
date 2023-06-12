package io.codelex.oop.summary;

import java.time.LocalDate;

public class ItemPacking implements Service {
    private static final String NAME = "Item packing";
    private static final double PRICE = 5.00;


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getFullInfo() {
        return String.format("%s, %.2f EUR", getName(), getPrice());
    }

    @Override
    public LocalDate getExpirationDate() {
        return null;
    }
}
