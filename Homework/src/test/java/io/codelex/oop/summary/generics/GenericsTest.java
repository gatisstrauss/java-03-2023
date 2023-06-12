package io.codelex.oop.summary.generics;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Optional;

public class GenericsTest {

    @Test
    public void testCombineTwoItems() {
        Object first = "Hello";
        Object second = 123.123;

        String expectedResult = "First item: Hello; Second item: 123.123";

        String result = Combiner.combineTwoItems(first, second);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrint() {
        Printer<String> stringPrinter = new Printer<>("Hello, world!");
        stringPrinter.print();

        Printer<Integer> integerPrinter = new Printer<>(123);
        integerPrinter.print();

        Printer<BigDecimal> decimalPrinter = new Printer<>(new BigDecimal("3.14"));
        decimalPrinter.print();
    }

    @Test
    public void testGetThingToPrint() {
        Printer<String> stringPrinter = new Printer<>("Hello, world!");
        assertEquals("Hello, world!", stringPrinter.getThingToPrint());

        Printer<Integer> integerPrinter = new Printer<>(123);
        assertEquals(123, integerPrinter.getThingToPrint());

        Printer<BigDecimal> decimalPrinter = new Printer<>(new BigDecimal("3.14"));
        assertEquals(new BigDecimal("3.14"), decimalPrinter.getThingToPrint());
    }

    @Test
    public void testAddMoreItems() {
        StorageHouse<Integer> storageHouse = new StorageHouse<>(1);

        storageHouse.addMoreItems(2);
        storageHouse.addMoreItems(3);
    }

    @Test
    public void testGetMaybeFirstItem() {
        StorageHouse<String> storageHouse = new StorageHouse<>("First Item");

        Optional<String> maybeFirstItem = storageHouse.getMaybeFirstItem();

        assertTrue(maybeFirstItem.isPresent());
        assertEquals("First Item", maybeFirstItem.get());
    }

    @Test
    public void testPrintItems() {
        StorageHouse<String> storageHouse = new StorageHouse<>("First Item");
        storageHouse.addMoreItems("Second Item");
        storageHouse.addMoreItems("Third Item");

        storageHouse.printItems();

    }
}
