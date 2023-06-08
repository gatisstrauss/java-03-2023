package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private double dimensions;
    private int numberOfCopies;
    private int costPerCopy;

    public Poster(int fee, double dimensions, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return super.cost() + (int) (dimensions * numberOfCopies * costPerCopy);
    }

    @Override
    public String toString() {
        return super.toString() + ", Poster: Dimensions= " + dimensions + ", Number of Copies= " + numberOfCopies + ", Cost per Copy= " + costPerCopy;
    }
}
