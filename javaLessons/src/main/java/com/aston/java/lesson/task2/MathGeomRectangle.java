package com.aston.java.lesson.task2;

public interface MathGeomRectangle {
    default double getRectanglePerimeter (double height, double width) {
        return 2 * (height + width);
    }
    default double getRectangleArea (double height, double width) {
        return height * width;
    }
}
