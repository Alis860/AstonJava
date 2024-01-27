package com.aston.java.lesson;

//    Создать массив из 5 сотрудников.
//            Пример:
//    вначале объявляем массив объектов
//    Person[] persArray = new Person[5];
//    потом для каждой ячейки массива задаем объект
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//    persArray[1] = new Person(...);
//    ...
//    persArray[4] = new Person(...);
public class Person {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {
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
