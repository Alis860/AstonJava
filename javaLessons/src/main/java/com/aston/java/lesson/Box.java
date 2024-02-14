package com.aston.java.lesson;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    //Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну
    // коробку нельзя сложить и яблоки, и апельсины;
    //Для хранения фруктов внутри коробки можно использовать ArrayList;
    //Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока –
    // 1.0f, апельсина – 1.5f (единицы измерения не важны);
    //Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут
    // в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать
    // коробки с яблоками и апельсинами;
    //Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
//    нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую
//    перекидываются объекты, которые были в первой;
    //Не забываем про метод добавления фрукта в коробку.
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

