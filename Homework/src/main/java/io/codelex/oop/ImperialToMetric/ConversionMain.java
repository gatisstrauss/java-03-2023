package io.codelex.oop.ImperialToMetric;

public class ConversionMain {
    public static void main(String[] args) {

        int meters = 1000;
        double convertedYards = MeasurementConverter.converter(meters, ConversionType.METERS_TO_YARDS);
        System.out.println(meters + " meters is equal to " + convertedYards + " yards");

        int miles = 5;
        double convertedKilometers = MeasurementConverter.converter(miles, ConversionType.MILES_TO_KILOMETERS);
        System.out.println(miles + " miles is equal to " + convertedKilometers + " kilometers");

        int inches = 33;
        double convertedCentimeters = MeasurementConverter.converter(inches, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(inches + " inches is equal to " + convertedCentimeters + " centimeters");
    }
}
