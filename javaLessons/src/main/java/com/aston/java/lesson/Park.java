package com.aston.java.lesson;

//Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
// времени их работы и стоимости.
public class Park {
    private final Attraction[] attractions;

    public Park(Attraction[] attractions) {
        this.attractions = attractions;
    }


    public static class Attraction {
        private final String name;
        private final String time;
        private final double price;

        public Attraction(String name, String time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public double getPrice() {
            return price;
        }
    }

    public void printAttractionsInfo() {
        for (Attraction attraction : attractions) {
            System.out.println("Название: " + attraction.getName());
            System.out.println("Время работы: " + attraction.getTime());
            System.out.println("Стоимость: " + attraction.getPrice());
            System.out.println();
        }
    }
}

