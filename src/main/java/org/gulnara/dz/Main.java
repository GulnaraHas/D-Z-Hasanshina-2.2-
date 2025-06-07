package org.gulnara.dz;

public class Main {
    // Пример использования
    public static void main(String[] args) {
        Park disneyland = new Park("Disneyland");

        // Добавляем аттракционы
        disneyland.addAttraction("Колесо обозрения", "10:00-22:00", 500);
        disneyland.addAttraction("Американские горки", "11:00-20:00", 800);
        disneyland.addAttraction("Дом с привидениями", "12:00-23:00", 650);

        // Выводим информацию
        disneyland.displayAllAttractions();
    }
}
