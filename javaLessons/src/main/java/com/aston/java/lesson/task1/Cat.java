package com.aston.java.lesson.task1;

public class Cat extends Animal {
    private static int catCount;
    private boolean isHungry;

    public Cat(int maxRun, int maxSwim) {
        super(maxRun, maxSwim);
        this.maxSwim = 0;
        isHungry = true;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void swim(int distance) {
        System.out.println("Кот Мурзик не умеет плавать");
    }

    public void eat(int foodAmount, Bowl bowl) {
        if (bowl.getFoodAmount() < foodAmount) {
            System.out.println("В миске недостаточно еды для Мурзика");
        } else {
            bowl.setFoodAmount(bowl.getFoodAmount() - foodAmount);
            System.out.println("Кот Мурзик поел");
            isHungry = false;
        }
    }
}
