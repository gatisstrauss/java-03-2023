package io.codelex.oop.computers;

public class ComputerMain {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Intel i7", "16", "NVIDIA GeForce GTX 1660", "Dell", "XPS 15");
        Computer computer2 = new Computer("AMD Ryzen 9", "32", "NVIDIA GeForce RTX 3080", "HP", "Omen 15");

        System.out.println(computer1);
        System.out.println(computer2);

        computer1.setCompany("Mac");
        computer2.setRam("16");

        System.out.println(computer1);
        System.out.println(computer2);

        System.out.println(computer1.equals(computer2));

        Laptop laptop1 = new Laptop("M1", "8", "Apple M1 GPU (8-core)", "Apple", "Air", " 58.2");
        Laptop laptop2 = new Laptop("M2", "16", "Apple M2 GPU (8-core)", "Apple", "Air", " 52.6");

        System.out.println(laptop1);
        System.out.println(laptop2);

        laptop1.setRam("16");
        laptop2.setBattery("58.2");

        System.out.println(laptop1);
        System.out.println(laptop2);

        System.out.println(laptop1.equals(laptop2));
    }
}
