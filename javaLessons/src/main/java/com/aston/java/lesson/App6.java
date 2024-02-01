package com.aston.java.lesson;

public class App6 {

    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        AppData appData = new AppData(header, data);

        // Сохранение данных в файл
        appData.saveToFile("newFile.csv");

        // Загрузка данных из файла
        AppData loadedData = AppData.loadFromFile("newFile.csv");

        // Вывод заголовка и данных на экран
        System.out.println(String.join("; ", loadedData.getHeader()));
        for (int[] row : loadedData.getData()) {
            if (row != null) {
                for (int element : row) {
                    System.out.print(element + "; ");
                }
                System.out.print("\n");
            }
        }
    }
}