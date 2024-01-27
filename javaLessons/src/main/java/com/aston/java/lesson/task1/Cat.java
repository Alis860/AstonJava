package com.aston.java.lesson.task1;

public class Cat extends Animal {
    private static int catCount;
    private boolean isHungry;
    private Bowl bowl;

    public Cat() {
        isHungry = true;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setBowl(Bowl bowl) {
        this.bowl = bowl;
    }

    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Мурзик кот, а не лев, и столько метров он пробежать не может");
        } else
            System.out.println("Кот Мурзик молодец, он пробежал: " + distance + "м");
    }

    public void swim(int distance) {
        System.out.println("Кот Мурзик не умеет плавать");
    }

    public void eat(int foodAmount) {
        if (bowl.getFoodAmount() < foodAmount) {
            System.out.println("В миске недостаточно еды для Мурзика");
        } else {
            bowl.setFoodAmount(bowl.getFoodAmount() - foodAmount);
            System.out.println("Кот Мурзик поел");
            isHungry = false;
        }
    }
}
