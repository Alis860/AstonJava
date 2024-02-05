package com.aston.java.lesson.task1;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(int maxRun, int maxSwim) {
        super(maxRun, maxSwim);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

}
