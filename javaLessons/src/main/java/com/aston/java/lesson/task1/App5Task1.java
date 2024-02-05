package com.aston.java.lesson.task1;

//Создать классы Собака и Кот с наследованием от класса Животное.
//
//Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//
//У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//
//Добавить подсчет созданных котов, собак и животных.
//
//        Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:
//
//        Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.
//        Добавить метод, с помощью которого можно было бы добавлять еду в миску.
public class App5Task1 {
    public static void main(String[] args) {
        Animal animal = new Animal(500, 10);
        animal.run(233);
        animal.swim(400);
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        Dog dog = new Dog(30, 15);
        dog.run(500);
        dog.swim(10);
        Cat cat = new Cat(12, 0);
        Cat cat2 = new Cat(13, 0);
        cat.run(200);
        cat.swim(12);
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        Bowl bowl = new Bowl(3);
        Cat[] cats = {cat, cat2};
        for (Cat someCat : cats) someCat.eat(2, bowl);


        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isHungry()) {
                System.out.println("Кот под номером " + (i + 1) + " голоден");
            } else {
                System.out.println("Кот под номером " + (i + 1) + " сыт");
            }
        }
        System.out.println("Количество еды в миске " + bowl.getFoodAmount());
    }
}


