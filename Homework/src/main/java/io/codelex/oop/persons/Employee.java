package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private final String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getStartedWorking() {
        return startedWorking;
    }

    public int getWorkExperience() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(startedWorking, currentDate);
        return period.getYears();
    }

    @Override
    public String getInfo() {
        int yearsOfWork = getWorkExperience();
        return getPosition() + " " + getFirstName() + " " + getLastName() + " " + getId() + " (" + yearsOfWork + " years of experience)";
    }
}
