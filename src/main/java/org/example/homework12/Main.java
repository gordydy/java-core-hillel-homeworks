package org.example.homework12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Paul", 24, 91));
        students.add(new Student("George", 19, 75));
        students.add(new Student("John", 25, 60));
        students.add(new Student("Ringo", 20, 59));

        printAllStudentsNames(students);
        System.out.println("*".repeat(15));

        printOlderStudentsNames(students);
        System.out.println("*".repeat(15));

        printNamesOfExcellentStudents(students);
        System.out.println("*".repeat(15));

        System.out.println(getAvgGrade(students));
        System.out.println("*".repeat(15));

        System.out.println(getStudentWithHighestGrade(students));
        System.out.println("*".repeat(15));

        System.out.println(getCountOfStudentWithGradeBelowSixty(students));
    }

    private static void printAllStudentsNames(List<Student> students) {
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }

    private static void printOlderStudentsNames(List<Student> students) {
        students.stream()
                .filter(student -> student.getAge() > 20)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    private static void printNamesOfExcellentStudents(List<Student> students) {
        students.stream()
                .filter(student -> student.getGrade() >= 90)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    private static double getAvgGrade(List<Student> students) {
        return students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0);
    }

    private static Student getStudentWithHighestGrade(List<Student> students) {
        return students.stream()
                .max(Comparator.comparing(Student::getGrade))
                .orElseThrow();
    }

    private static long getCountOfStudentWithGradeBelowSixty(List<Student> students) {
        return students.stream()
                .filter(grade -> grade.getGrade() < 60)
                .count();
    }

}
