package task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class ElementsCollection {
    public static void main(String[] args) {
//        Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4".
//        Необходимо отсортировать строки по возрастанию и добавить их в массив;
        List<String> collection = asList("f10", "f15", "f2", "f4", "f4");
        Collections.sort(collection);

        String[] sortedArray = collection.toArray(new String[0]);
        System.out.println("Массив отсортирован: " + Arrays.toString(sortedArray));
    }
}
