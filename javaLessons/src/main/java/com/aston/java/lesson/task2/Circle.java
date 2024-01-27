package com.aston.java.lesson.task2;

public class Circle extends Figure implements MathGeomCircle {
       private double radius;



    public Circle(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Параметры круга: \n" +
                "Периметр: " + getCirclePerimeter(getRadius()) + "\n" +
                "Площадь: " + getCircleArea(getRadius()) + "\n" +
                "Цвет заливки: " + getFillColor() + "\n" +
                "Цвет границы: " + getBorderColor();
    }
}
