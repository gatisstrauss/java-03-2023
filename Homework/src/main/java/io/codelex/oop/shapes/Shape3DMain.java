package io.codelex.oop.shapes;

public class Shape3DMain {
    public static void main(String[] args) {
        Shape3D cone = new Cone(2, 8);

        Shape3D cube = new Cube(5, 5);


        printShapeInfo3D(cone, Shape3D::getArea, Shape3D::getPerimeter, Shape3D::calculateVolume);
        printShapeInfo3D(cube, Shape3D::getArea, Shape3D::getPerimeter, Shape3D::calculateVolume);
    }

    private static void printShapeInfo3D(Shape3D shape, ShapeFunction<Double> areaFunction, ShapeFunction<Double> perimeterFunction, ShapeFunction<Double> calculateVolume) {
        System.out.println("Shape: " + shape.getClass().getSimpleName());
        System.out.println("Number of Sides: " + shape.getNumSides());
        System.out.println("Area: " + areaFunction.calculate(shape));
        System.out.println("Perimeter: " + perimeterFunction.calculate(shape));
        System.out.println("Volume: " + calculateVolume.calculate(shape));
        System.out.println();

    }
    interface ShapeFunction<T> {
        T calculate(Shape3D shape);
    }
}
