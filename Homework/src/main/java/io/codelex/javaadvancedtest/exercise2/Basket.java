package io.codelex.javaadvancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private static final int MAX_BASKET_CAPACITY = 10;

    private final List<T> items;
    private int itemCount;

    public Basket() {
        items = new ArrayList<>();
        itemCount = 0;
    }

    public void addToBasket(T item){
        if (itemCount == MAX_BASKET_CAPACITY){
            throw new BasketIsFullException("Basket is full!!!");
        }
        items.add(item);
        itemCount++;
    }
    public void removeFromBasket(){
        if (itemCount == 0){
            throw new BasketIsEmptyException("Basket is empty");
        }
        items.remove(itemCount - 1);
        itemCount--;
    }

    public List<T> getItems() {
        return items;
    }

    public int getItemCount() {
        return itemCount;
    }
}
