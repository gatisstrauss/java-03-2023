package io.codelex.classesandobjects.practice;

public class FuelGauge {
    private double currentLiters;

    public FuelGauge(double currentLiters) {
        this.currentLiters = currentLiters;
    }

    public double getCurrentLiters() {
        return currentLiters;
    }

    public void addFuel() {
        if (currentLiters < 70) {
            currentLiters++;
        } else {
            System.out.println("The tank is full");
        }
    }

    public void burnFuel() {
        if (currentLiters > 0) {
            currentLiters--;
        } else {
            System.out.println("The tank is empty");
        }
    }
}
