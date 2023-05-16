package io.codelex.classesandobjects.practice;

public class Product {
    String name;
    double priceAtStart;
    int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + priceAtStart + ", amount " + amountAtStart);
    }

    public void changePrice(double newPrice) {
        this.priceAtStart = newPrice;
    }

    public void changeAmount(int newAmount) {
        this.amountAtStart = newAmount;
    }

}
