package com.aston.java.lesson.task2;

public class Rectangle extends Figure implements MathGeomRectangle {
private double height;
    private double width;

    public Rectangle(String fillColor, String borderColor, double height, double width) {
        super(fillColor, borderColor);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public String toString() {
        return "Параметры прямоугольника: \n" +
                "Периметр: " + getRectanglePerimeter(getHeight(), getWidth()) + "\n" +
                "Площадь: " + getRectangleArea(getHeight(), getWidth()) + "\n" +
                "Цвет заливки: " + getFillColor() + "\n" +
                "Цвет границы: " + getBorderColor();
    }
}
