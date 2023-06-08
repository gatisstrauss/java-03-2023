package io.codelex.polymorphism.practice.exercise3;

public class PersonMain {
    public static void main(String[] args) {

        Student student = new Student("Gatis", "Strauss", "Gramzdas 21", 210197, 3.2);
        Employee employee = new Employee("Negatis", "Nestrauss", "Negramzdas 21", 12356, "Programmer");

        System.out.println("Student:");
        student.display();

        System.out.println("Employee");
        employee.display();

    }
}
