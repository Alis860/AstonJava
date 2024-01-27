package com.aston.java.lesson.task2;

public interface MathGeomCircle {
    default double getCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    default double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

}
