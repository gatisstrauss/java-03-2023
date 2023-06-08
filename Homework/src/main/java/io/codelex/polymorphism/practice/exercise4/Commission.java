package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private final double commissionRate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double base = super.pay();
        double commission = totalSales * commissionRate;
        totalSales = 0;

        return base + commission;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: $" + totalSales;
        return result;
    }
}
