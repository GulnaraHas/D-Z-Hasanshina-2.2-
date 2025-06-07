package org.gulnara.dz;
import java.time.LocalDate;

public class Product {
    private String name;                // Название товара
    private LocalDate productionDate;   // Дата производства
    private String manufacturer;        // Производитель
    private String countryOfOrigin;     // Страна происхождения
    private double price;               // Цена
    private boolean isReserved;         // Состояние бронирования покупателем

    // Конструктор класса
    public Product(String name, LocalDate productionDate, String manufacturer,
                   String countryOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    // Метод для вывода информации о товаре в консоль
    public void printProductInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Забронирован: " + (isReserved ? "Да" : "Нет"));
    }


}