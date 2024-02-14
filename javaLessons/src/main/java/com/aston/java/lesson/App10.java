package com.aston.java.lesson;

public class App10 {
    //Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());


        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        System.out.println("Apple box 1 weight: " + appleBox1.getWeight());
        System.out.println("Apple box 2 weight: " + appleBox2.getWeight());
        System.out.println("Orange box weight: " + orangeBox1.getWeight());
        System.out.println("Orange box weight: " + orangeBox2.getWeight());

        System.out.println("Apple box 1 equals Apple box 2: " + appleBox1.compare(appleBox2));
        System.out.println("Orange box 1 equals Orange box 2: " + orangeBox1.compare(orangeBox2));

        appleBox1.transferFruits(appleBox2);
        System.out.println("Apple box 1 weight after transfer: " + appleBox1.getWeight());
        System.out.println("Apple box 2 weight after transfer: " + appleBox2.getWeight());

        orangeBox1.transferFruits(orangeBox2);
        System.out.println("Orange box 1 weight after transfer: " + orangeBox1.getWeight());
        System.out.println("Orange box 2 weight after transfer: " + orangeBox2.getWeight());
    }
}


