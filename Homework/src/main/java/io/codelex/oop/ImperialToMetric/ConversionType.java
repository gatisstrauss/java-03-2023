package io.codelex.oop.ImperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(1.0936133),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_INCHES(0.3937008),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.6213712),
    MILES_TO_KILOMETERS(1.609344);
    private final double conversionRate;

    ConversionType(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double convert(double value) {
        return value * conversionRate;
    }
}
