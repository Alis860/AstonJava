package com.aston.java.lesson;

//Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
// времени их работы и стоимости.
public class Park {
    public static class Attraction {
        private final String name;
        private final String time;
        private final double price;

        public Attraction(String name, String time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public void printlnInfo() {
            System.out.println("Название: " + name);
            System.out.println("Время работы: " + time);
            System.out.println("Стоимость: " + price);
            System.out.println();
        }
    }
}