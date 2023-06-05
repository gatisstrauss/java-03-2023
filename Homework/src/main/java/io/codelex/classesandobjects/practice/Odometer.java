package io.codelex.classesandobjects.practice;

public class Odometer {
    private double currentMileage;
    private FuelGauge fuelGauge;

    public Odometer(double currentMileage, FuelGauge fuelGauge) {
        this.currentMileage = currentMileage;
        this.fuelGauge = fuelGauge;
    }

    public double getCurrentMileage() {
        return currentMileage;
    }

    public void addMiles() {
        currentMileage++;
        if (currentMileage > 999999) {
            currentMileage = 0;
        }
        if (currentMileage % 10 == 0) {
            fuelGauge.burnFuel();
        }
    }
}
