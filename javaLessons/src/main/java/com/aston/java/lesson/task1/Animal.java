package com.aston.java.lesson.task1;

public class Animal {
    private static int animalCount;
    protected int maxRun;
    protected int maxSwim;

    public Animal(int maxRun, int maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {
        if (distance > this.maxRun) {
            System.out.println("Животное не может пробежать" + distance + "м.");
        } else {
            System.out.println("Животное пробежало " + distance + " м.");
        }
    }


    public void swim(int distance) {
        if (distance > maxSwim) {
            System.out.println("Животное не может проплыть" + distance + "м.");
        } else {
            System.out.println("Животное проплыло " + distance + " м.");

        }

    }
}

