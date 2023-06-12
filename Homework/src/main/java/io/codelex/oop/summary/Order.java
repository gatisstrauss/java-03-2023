package io.codelex.oop.summary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<SellableThing> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem foodItem) {
            LocalDate today = LocalDate.now();
            if (foodItem.getExpirationDate().isBefore(today)) {
                throw new BadFoodException("Cannot add food item with expiration date in the past.");
            }
        }
        items.add(item);
    }

    public List<SellableThing> getItems() {
        return items;
    }

}
