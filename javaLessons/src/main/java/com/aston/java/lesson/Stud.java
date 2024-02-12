package com.aston.java.lesson;

import java.util.*;


public class Stud {
    public static void main(String[] args) {
        //Необходимо узнать средний возраст студентов мужского пола;
        double averageAge = calculateAverageAgeOfMaleStudents();
        System.out.println("Средний возраст студентов мужского пола: " + averageAge);
        //Кому из студентов грозит получение повестки в этом году при условии, что призывной возраст установлен
        // в диапазоне от 18 до 27 лет;
        List<Student> armyAge = armyForStudents();
        System.out.println("Повестку получит студент: ");
        for (Student student : armyAge) {
            System.out.println(student.getName());
        }
    }

    static Collection<Student> students = Arrays.asList(
            new Student("Дмитрий", 17, Gender.MAN),
            new Student("Максим", 20, Gender.MAN),
            new Student("Екатерина", 20, Gender.WOMAN),
            new Student("Михаил", 28, Gender.MAN)
    );

    private enum Gender {
        MAN,
        WOMAN
    }

    static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    "}";
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }

    static double calculateAverageAgeOfMaleStudents() {
        double averageAge = Stud.students.stream()
                .filter(student -> student.getGender() == Stud.Gender.MAN)
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);

        averageAge = Math.round(averageAge * 10.0) / 10.0;

        return averageAge;

    }

    static List<Student> armyForStudents() {
        List<Student> armyAge = new ArrayList<>();
        int minAge = 18;
        int maxAge = 27;


        for (Student student : Stud.students) {
            if (student.getGender() == Stud.Gender.MAN && student.getAge() >= minAge && student.getAge() <= maxAge) {
                armyAge.add(student);
            }
        }
        return armyAge;
    }


}

