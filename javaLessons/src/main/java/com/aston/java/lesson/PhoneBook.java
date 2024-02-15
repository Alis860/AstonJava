package com.aston.java.lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот
// телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона
// по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда
// при запросе такой фамилии должны выводиться все телефоны.
    public class PhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("122345","Иванов");
        phoneBook.add("111111","Сергеев");
        phoneBook.add("111111","Сидоров");
        phoneBook.add("456512","Иванов");

        System.out.println("Номера телефонов по фамилии:");
        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Сергеев: " + phoneBook.get("Сергеев"));
        System.out.println("Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Васечкин: " + phoneBook.get("Васечкин"));

    }

    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String phoneNumber, String name) {
        if (phoneBook.containsKey(phoneNumber)) {
            return;
        }
        List<String> phoneNumbers = phoneBook.getOrDefault(phoneNumber, new ArrayList<>());
        phoneNumbers.add(name);
        phoneBook.put(phoneNumber, phoneNumbers);

    }

    public List<String> get(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(name)) {
                phoneNumbers.add(entry.getKey());
            }
        }
        return phoneNumbers;
    }
}

