package com.aston.java.lesson;

//    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//    Конструктор класса должен заполнять эти поля при создании объекта.
//    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
public class Employee {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}
