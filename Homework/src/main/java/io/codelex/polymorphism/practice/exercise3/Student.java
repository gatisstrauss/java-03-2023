package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {

    private final double gpa;

    public Student(String firstName, String lastName, String address, int id, double gpa) {
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("GPA: " + gpa);
    }
}
