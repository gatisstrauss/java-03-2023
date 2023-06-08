package io.codelex.polymorphism.practice.exercise3;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final int id;

    public Person(String firstName, String lastName, String address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    public void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("ID: " + id);
    }
}
