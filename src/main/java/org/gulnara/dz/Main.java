package org.gulnara.dz;
public class Main {
    public static void main(String[] args) {
        // Создаем фигуры
        GeometricShape circle = new Circle(5, "Красный", "Черный");
        GeometricShape rectangle = new Rectangle(4, 6, "Синий", "Белый");
        GeometricShape triangle = new Triangle(3, 4, 5, "Зеленый", "Желтый");

        // Выводим информацию о фигурах
        System.out.println("Круг:");
        circle.displayInfo();

        System.out.println("\nПрямоугольник:");
        rectangle.displayInfo();

        System.out.println("\nТреугольник:");
        triangle.displayInfo();
    }
}

