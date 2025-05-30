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

    public static boolean task5() {
        int a = 7;
        int b = -5;
        int sum = a + b;
        System.out.println ("----- Задача 5 ------");
        return sum >= 10 && sum <= 20;
    }

    public static void task6(int number) {
        if (number >= 0) {
            System.out.println("----- Задача 6 ------");
            System.out.println("Число положительное");
        } else {
            System.out.println("----- Задача 6 ------");
            System.out.println("Число отрицательное");
        }
    }
    /*Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    Замечание: ноль считаем положительным числом.*/
    public static boolean task7 (int number) {
        System.out.println("----- Задача 7 ------");
        return number < 0;

    }
    /*Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз*/
    public static void task8 (String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("----- Задача 8 ------");
            System.out.println(str);
        }
    }

}




