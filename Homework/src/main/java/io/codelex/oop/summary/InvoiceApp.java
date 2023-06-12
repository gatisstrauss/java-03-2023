package io.codelex.oop.summary;

import java.time.LocalDate;

public class InvoiceApp {
    public static void main(String[] args) throws WrongOrderException, BadFoodException {
        Order order = new Order();

        FoodItem milk = new FoodItem("Milk", 0.75, LocalDate.of(2023, 6, 12));
        ElectronicsItem radio = new ElectronicsItem("Radio", 25.00, 100);
        HouseholdItem bucket = new HouseholdItem("Bucket", 5.00, "red");

        order.addItem(milk);
        order.addItem(radio);
        order.addItem(bucket);

        Service itemPacking = new ItemPacking();
        order.addItem(itemPacking);

        Invoice invoice = new Invoice(order, "INV123");


        invoice.sent();

        System.out.println(invoice.formattedInvoice());
    }
}
