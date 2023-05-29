package com.company.encapsulation;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Erlan", 3);
        Student student1 = new Student("Arman", 3.9);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student);

        students.stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .forEach(System.out::println);

    }
}
