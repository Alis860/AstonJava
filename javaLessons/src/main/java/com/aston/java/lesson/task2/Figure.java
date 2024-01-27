package com.aston.java.lesson.task2;

public class Figure {

    private String fillColor;
    private String borderColor;

    public Figure(String fillColor, String borderColor) {

        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }


    public String getFillColor() {
        return fillColor;
    }


    public String getBorderColor() {
        return borderColor;
    }
}