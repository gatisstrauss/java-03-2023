package io.codelex.classesandobjects.practice;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

        product1.changeAmount(1);
        product2.changePrice(80.00);
        product3.changePrice(20.32);

        System.out.println();

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();
    }
}
