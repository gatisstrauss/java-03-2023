package io.codelex.classesandobjects.practice;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double totalLiters;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
        this.endKilometers = startKilometers;
        this.totalLiters = 0;

    }

    public void fillUp(int mileage, double liters) {
        totalLiters += liters;
        endKilometers = mileage;
    }

    public double calculateConsumption() {
        double distance = endKilometers - startKilometers;
        return totalLiters / (distance / 100.00);
    }

    public boolean gasHog() {
        double consumption = calculateConsumption();
        return consumption > 15.0;
    }

    public boolean economyCar() {
        double consumption = calculateConsumption();
        return consumption < 5.0;
    }
}
