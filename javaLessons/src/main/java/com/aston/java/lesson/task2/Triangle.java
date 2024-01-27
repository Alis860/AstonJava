package com.aston.java.lesson.task2;

public class Triangle extends Figure implements MathGeomTriangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(String fillColor, String borderColor, double firstSide, double secondSide, double thirdSide) {
        super(fillColor, borderColor);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public String toString() {
        return "Параметры треугольника: \n" +
                "Периметр: " + getTrianglePerimeter(getFirstSide(), getSecondSide(), getThirdSide()) + "\n" +
                "Площадь: " + getTriangleArea(getFirstSide(), getSecondSide(), getThirdSide()) + "\n" +
                "Цвет заливки: " + getFillColor() + "\n" +
                "Цвет границы: " + getBorderColor();
    }
}
