package io.codelex.oop.shapes;

public class Cone extends Shape3D{

    private final double width;
    private final double height;

    public Cone(double width, double height) {
        super(1);
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
        double radius = width / 2.0;
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * slantHeight + Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        //Not possible
        return 0;
    }

    @Override
    public double calculateVolume() {
        double radius = width / 2.0;
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}
