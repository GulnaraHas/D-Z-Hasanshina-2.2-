package org.gulnara.dz;
interface GeometricShape {
    // Методы для получения цветов
    String getFillColor();
    String getBorderColor();

    // Дефолтные методы для расчета периметра и площади
    default double calculatePerimeter() {
        return 0;
    }

    default double calculateArea() {
        return 0;
    }

    // Метод для вывода информации о фигуре
    default void displayInfo() {
        System.out.println("Периметр: " + calculatePerimeter() +
                ", Площадь: " + calculateArea() +
                ", Цвет фона: " + getFillColor() +
                ", Цвет границ: " + getBorderColor());
    }
}
