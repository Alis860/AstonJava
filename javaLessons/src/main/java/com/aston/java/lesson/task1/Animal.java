package com.aston.java.lesson.task1;

public class Animal {
    private static int animalCount;
    public Animal() {
        animalCount++;
    }
    public static int getAnimalCount () {
        return animalCount;
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.run(233);
        animal.swim(400);
        System.out.println("Количество животных: " + Animal.getAnimalCount());
    }
        public void run ( int distance){
            System.out.println("Животное пробежало " + distance + " м.");
        }

        public void swim ( int distance){
            System.out.println("Животное проплыло " + distance + " м.");
        }

    }

