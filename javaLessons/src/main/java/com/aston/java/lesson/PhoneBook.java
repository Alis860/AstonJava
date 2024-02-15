package com.aston.java.lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("122345", "Иванов");
        phoneBook.add("111111", "Сергеев");
        phoneBook.add("111132", "Сидоров");
        phoneBook.add("456512", "Иванов");

        System.out.println("Номера телефонов по фамилии:");
        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Сергеев: " + phoneBook.get("Сергеев"));
        System.out.println("Сидоров: " + phoneBook.get("Сидоров"));
    }

    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String phoneNumber, String lastName) {
        List<String> phoneNumbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(lastName, phoneNumbers);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
}


