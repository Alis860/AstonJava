package com.aston.java.lesson;

public class App4 {

    public static void main(String[] args) {
        Employee employee = new Employee("Петров Сергей Александрович", "Конструктор 1й категории", "serge@example.com", "112233", 50000, 45);
        employee.printInfo();
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Peter", "Doctor", "pepeter@mailbox.com", "123123123", 10000, 25);
        persArray[2] = new Person("Smirnov Semen", "Musician", "smsemen@mailbox.com", "987654321", 15000, 20);
        persArray[3] = new Person("Kuznetsov Kuzma", "Programmer", "kukuzma@mailbox.com", "321456987", 55000, 36);
        persArray[4] = new Person("Kantorovich Egor", "Plumber", "sisidor@mailbox.com", "123654789", 13000, 55);
        for (Person person : persArray)
            person.printInfo();

        Park.Attraction attraction1 = new Park.Attraction("Лодочки", "10.00 - 22.00", 12.3);
        attraction1.printlnInfo();
        Park.Attraction attraction2 = new Park.Attraction("Лошадки", "11.00 - 20.00", 15.3);
        attraction2.printlnInfo();
        Park.Attraction attraction3 = new Park.Attraction("Колесо обозрения", "10.00 - 23.00", 22.5);
        attraction3.printlnInfo();
    }
}