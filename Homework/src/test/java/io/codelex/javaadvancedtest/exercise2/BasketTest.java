package io.codelex.javaadvancedtest.exercise2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BasketTest {

    @Test
    public void testAddToBasket() {
        Basket<Apple> appleBasket = new Basket<>();
        Apple apple = new Apple();

        for (int i = 0; i < 10; i++) {
            appleBasket.addToBasket(apple);
        }

        Assertions.assertThrows(BasketIsFullException.class, () -> {
            appleBasket.addToBasket(apple);
        });
    }

    @Test
    public void testRemoveFromBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        Mushroom mushroom = new Mushroom();

        for (int i = 0; i < 10; i++) {
            mushroomBasket.addToBasket(mushroom);
        }
        for (int i = 0; i < 10; i++) {
            mushroomBasket.removeFromBasket();
        }
        Assertions.assertThrows(BasketIsEmptyException.class, mushroomBasket::removeFromBasket);
    }
}