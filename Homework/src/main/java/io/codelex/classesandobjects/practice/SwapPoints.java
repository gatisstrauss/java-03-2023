package io.codelex.classesandobjects.practice;

import java.awt.*;

public class SwapPoints {
    public static void swapPoints(Point point1, Point point2) {
        int coordinateX = (int) point1.getX();
        int coordinateY = (int) point1.getY();
        point1.setLocation((int) point2.getX(), (int) point2.getY());
        point2.setLocation(coordinateX, coordinateY);
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, -5);
        Point p2 = new Point(1, 6);

        swapPoints(p1, p2);

        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }
}

