package com.aston.java.lesson.task2;
//Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
//Задать для каждой фигуры цвет заливки и цвет границы.
//Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.
//
//
//Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.
public class App5Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", "White", 10);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle("Green", "Black", 5, 10);
        System.out.println(rectangle);
        Triangle triangle = new Triangle("Yellow", "Grey", 3, 5, 3);
        System.out.println(triangle);
    }
}



