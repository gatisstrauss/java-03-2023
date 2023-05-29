package io.codelex.oop.shapes;

public class ShapeMain {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 3);

        Shape triangle = new Triangle(4, 6);

        Shape hexagon = new Hexagon(6, 9);

        printShapeInfo(rectangle, Shape::getArea, Shape::getPerimeter);
        printShapeInfo(triangle, Shape::getArea, Shape::getPerimeter);
        printShapeInfo(hexagon, Shape::getArea, Shape::getPerimeter);

    }


    private static void printShapeInfo(Shape shape, ShapeFunction<Double> areaFunction, ShapeFunction<Double> perimeterFunction) {
        System.out.println("Shape: " + shape.getClass().getSimpleName());
        System.out.println("Number of Sides: " + shape.getNumSides());
        System.out.println("Area: " + areaFunction.calculate(shape));
        System.out.println("Perimeter: " + perimeterFunction.calculate(shape));
        System.out.println();
    }

    interface ShapeFunction<T> {
        T calculate(Shape shape);

    }
}

