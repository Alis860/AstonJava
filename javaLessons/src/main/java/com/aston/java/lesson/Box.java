package com.aston.java.lesson;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        } else {
            float weight = 0.0f;
            for (T fruit : fruits) {
                weight += fruit.getWeight();
            }
            return weight;
        }
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<T> otherBox) {
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
}

