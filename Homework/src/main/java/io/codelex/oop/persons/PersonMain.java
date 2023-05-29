package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonMain {
    public static void main(String[] args) {

        Employee employee = new Employee("John", "Brown", "EMP123", 35, "Accountant", LocalDate.of(2010, 1, 1));
        System.out.println(employee.getInfo());

        Customer customer = new Customer("Peter", "Brown", "CID1234", 28, "Customer123", 0);
        System.out.println(customer.getInfo());

        customer.setPurchaseCount(15);
        System.out.println(customer.getInfo());

    }
}
