package io.codelex.oop.ImperialToMetric;

public class MeasurementConverter {
    public static double converter(int value, ConversionType conversionType) {
        return conversionType.convert(value);
    }
}
