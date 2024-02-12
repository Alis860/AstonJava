package com.aston.java.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Log {
    public static void main(String[] args) {
//        Нужно написать программу, которая будет принимать от пользователя ввод различных логинов.
//        Как только пользователь введет пустую строку - программа должна прекратить приём данных от
//        пользователя и вывести в консоль логины, начинающиеся на букву f (строчную).

        List<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логины, для завершения введите пустую строку: ");
        while (true) {
            String login = scanner.nextLine().trim();
            if (login.isEmpty()) {
                break;
            }
            if (login.charAt(0) == 'f') {
                logins.add(login);
            }
        }

        System.out.println("Логины, начинающиеся с буквы 'f': ");
        for (String login : logins) {
            System.out.println(login);
        }
    }
}

