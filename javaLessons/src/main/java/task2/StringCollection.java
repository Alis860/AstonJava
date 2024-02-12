package task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCollection {
    public static void main(String[] args) {
        //Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload».
        //Нужно с ней выполнить следующие манипуляции:

        //Посчитать, сколько раз объект «High» встречается в коллекции;
        List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload");
        int countHigh = Collections.frequency(collection, "High");
        System.out.println("Число вхождений 'High': " + countHigh);

        //Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию,
        // то пусть возвращается 0;
        String firstElement = collection.get(0);
        System.out.println("Первый элемент коллекции: " + firstElement);

        //Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0;
        String lastElement = collection.get(collection.size() - 1);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}
