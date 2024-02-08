package com.aston.java.lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class PhoneBook {
        private final Map<String, List<String>> phoneBook;

        public PhoneBook() {
            phoneBook = new HashMap<>();
        }

        public void add(String Name, String phoneNumber) {
            List<String> phoneNumbers = phoneBook.getOrDefault(Name, new ArrayList<>());
            phoneNumbers.add(phoneNumber);
            phoneBook.put(Name, phoneNumbers);
        }

        public List<String> get(String Name) {
            return phoneBook.getOrDefault(Name, new ArrayList<>());
        }
    }
