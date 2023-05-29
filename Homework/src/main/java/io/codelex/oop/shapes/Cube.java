package io.codelex.oop.shapes;

public class Cube extends Shape3D{
    private final double width;
    private final double height;

    public Cube(double width, double height) {
        super(6);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(width, 2);
    }

    @Override
    public double getPerimeter() {
        //Not possible
        return 0;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(width, 3);
    }
}
