package com.aston.java.lesson;

import java.util.*;

public class App8 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "lemon", "banana", "kiwi", "melon", "orange", "grape",
                "watermelon", "lemon", "pear", "apple", "kiwi", "mango", "orange", "grape", "lemon", "apple"};

        List<String> wordList = new ArrayList<>(List.of(words)); //преобразуем массив в список wordList
        Set<String> uniqueWords = new HashSet<>(wordList); //создаем множество (Set) uniqueWords, чтобы найти все уникальные слова

        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCountMap = new HashMap<>(); //создаем карту (Map) wordCountMap, которая будет хранить каждое слово в качестве ключа и количество его вхождений в массиве в качестве значения
        for (String word : wordList) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("\nЧастота встречаемости слов:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Создаем телефонный справочник
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "122345");
        phoneBook.add("Сергеев", "988765");
        phoneBook.add("Сидоров", "562345");
        phoneBook.add("Иванов", "456512");


        System.out.println("\nНомера телефонов по фамилии:");
        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Сергеев: " + phoneBook.get("Сергеев"));
        System.out.println("Васечкин: " + phoneBook.get("Васечкин"));

    }
}