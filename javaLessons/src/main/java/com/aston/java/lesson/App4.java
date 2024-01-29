package com.aston.java.lesson;

public class App4 {

    public static void main(String[] args) {
        Employee employee = new Employee("Петров Сергей Александрович", "Конструктор 1й категории", "serge@example.com", "112233", 50000, 45);
        employee.printInfo();

        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        emplArray[1] = new Employee("Petrov Peter", "Doctor", "pepeter@mailbox.com", "123123123", 10000, 25);
        emplArray[2] = new Employee("Smirnov Semen", "Musician", "smsemen@mailbox.com", "987654321", 15000, 20);
        emplArray[3] = new Employee("Kuznetsov Kuzma", "Programmer", "kukuzma@mailbox.com", "321456987", 55000, 36);
        emplArray[4] = new Employee("Kantorovich Egor", "Plumber", "sisidor@mailbox.com", "123654789", 13000, 55);
        for (Employee person : emplArray)
            person.printInfo();

        Park.Attraction attraction1 = new Park.Attraction("Лодочки", "10.00 - 22.00", 12.3);
        Park.Attraction attraction2 = new Park.Attraction("Лошадки", "11.00 - 20.00", 15.3);
        Park.Attraction attraction3 = new Park.Attraction("Колесо обозрения", "10.00 - 23.00", 22.5);
        Park.Attraction[] attractions = {attraction1, attraction2, attraction3};
        Park park = new Park(attractions);
        park.printAttractionsInfo();
    }
}
