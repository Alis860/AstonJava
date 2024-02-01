package com.aston.java.lesson;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class AppData {
    private final String[] header;
    private final int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void saveToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            // Записываем заголовок в файл
            writer.write(String.join(";", header));
            writer.write("\n");

            // Записываем данные в файл
            for (int[] row : data) {
                String[] rowData = new String[row.length];
                for (int i = 0; i < row.length; i++) {
                    rowData[i] = Integer.toString(row[i]);
                }
                writer.write(String.join(";", rowData));
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData loadFromFile(String fileName) {
        String[] header = null;
        int[][] data = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Считываем заголовок
            line = reader.readLine();
            if (line != null) {
                header = line.split(";");
            }

            // Считываем данные
            int rowCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] rowValues = line.split(";");
                if (data == null) {
                    data = new int[rowValues.length][];
                }

                int[] rowData = new int[rowValues.length];
                for (int i = 0; i < rowValues.length; i++) {
                    rowData[i] = Integer.parseInt(rowValues[i]);
                }
                data[rowCount] = rowData;
                rowCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new AppData(header, data);
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }
}
