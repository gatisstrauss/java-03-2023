package io.codelex.oop.shapes;

public class Hexagon extends Shape{

    private final double width;
    private final double height;
    public Hexagon(double width, double height) {
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
        return (3 * Math.sqrt(3) / 2) * width * height;
    }

    @Override
    public double getPerimeter() {
        return 6 * width;
    }
}
