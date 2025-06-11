package org.gulnara.dz;
import java.util.*;

public class Main {
        public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        // Создаем студентов с оценками
        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 4);
        grades1.put("Physics", 5);
        students.add(new Student("Alice", "Group A", 1, grades1));

        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 2);
        grades2.put("Physics", 3);
        students.add(new Student("Bob", "Group B", 2, grades2));

        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Math", 5);
        grades3.put("Physics", 5);
        students.add(new Student("Charlie", "Group A", 1, grades3));

        System.out.println("All students:");
        students.forEach(System.out::println);

        // Удаляем студентов со средним баллом < 3
        Student.removeUnderperformingStudents(students);
        System.out.println("\nAfter removing underperforming students:");
        students.forEach(System.out::println);

        // Переводим студентов на следующий курс
        Student.promoteStudents(students);
        System.out.println("\nAfter promoting students:");
        students.forEach(System.out::println);

        // Печатаем студентов определенного курса
        System.out.println();
        Student.printStudents(students, 2);
    }
}