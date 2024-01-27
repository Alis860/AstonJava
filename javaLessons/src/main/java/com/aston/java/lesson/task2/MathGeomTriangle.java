package com.aston.java.lesson.task2;

public interface MathGeomTriangle {
    default double getTrianglePerimeter (double firstSide, double secondSide, double thirdSide) {
        return firstSide + secondSide + thirdSide;
    }
    default double getTriangleArea (double firstSide, double secondSide, double thirdSide) {
        double p = getTrianglePerimeter(firstSide, secondSide, thirdSide)/2;
        return Math.sqrt(p *(p-firstSide)*(p-secondSide)*(p-thirdSide)); //по формуле Герона
    }
}
