package io.codelex.classesandobjects.practice;

public class OdometerAndFuelGaugeTest {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(0);
        Odometer odometer = new Odometer(0, fuelGauge);

        for (int i = 0; i < 70; i++) {
            fuelGauge.addFuel();
        }

        while (fuelGauge.getCurrentLiters() > 0) {
            odometer.addMiles();
            if (odometer.getCurrentMileage() % 10 == 0) {
                fuelGauge.burnFuel();
            }

            System.out.println("Current mileage: " + odometer.getCurrentMileage());
            System.out.println("Current fuel " + fuelGauge.getCurrentLiters());
            System.out.println();
        }
    }
}
