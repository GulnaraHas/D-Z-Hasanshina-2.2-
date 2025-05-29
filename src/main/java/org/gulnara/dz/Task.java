package org.gulnara.dz;
public class Task {
    public static void task1() {
        System.out.println("----- Задача 1 ------");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void task2() {
        int a = 7;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("----- Задача 2 ------");
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

    public static void task3() {
        int value = 35;
        if (value <= 0) {
            System.out.println("----- Задача 3 ------");
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("----- Задача 3 ------");
            System.out.println("Желтый");
        } else {

            System.out.println("Зеленый");
        }
         }
    public static void task4() {
        int a = 62;
        int b = 4;
        if (a >= b) {
            System.out.println("----- Задача 4 ------");
            System.out.println("a >= b");
        } else {
            System.out.println("----- Задача 4 ------");
            System.out.println("a < b");
        }
    }
}


