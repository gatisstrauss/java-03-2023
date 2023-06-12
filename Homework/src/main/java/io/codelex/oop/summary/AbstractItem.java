package io.codelex.oop.summary;

public abstract class AbstractItem implements SellableThing {
    private final String name;
    private final double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public abstract String getFullInfo();
}
