package com.aston.java.lesson.task1;

public class Dog extends Animal {
    private static int dogCount;
    public Dog() {
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Бобик собака, а не конь, и и столько метров он пробежать не может");
        } else
            System.out.println("Бобик молодец, он пробежал: " + distance + "м");
    }

    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Бобик собака, а не крокодил, и столько метров он проплыть не может");
        } else
            System.out.println("Собака Бобик молодец, он проплыл: " + distance + "м");
    }
    }
