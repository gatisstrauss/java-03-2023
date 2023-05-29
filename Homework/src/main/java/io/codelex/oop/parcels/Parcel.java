package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Dimensions must be at least 30.");
            return false;
        }

        int sumOfDimensions = xLength + yLength + zLength;
        if (sumOfDimensions > 300) {
            System.out.println("Sum of dimensions exceeds 300.");
            return false;
        }

        double maxWeight = isExpress ? 15.0 : 30.0;
        if (weight > maxWeight) {
            System.out.println("Weight exceeds " + maxWeight + ".");
            return false;
        }

        return true;
    }

}
