package org.gulnara.dz;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {
        // Создаем массив из 5 товаров
        Product[] productsArray = new Product[5];

        // Заполняем массив товарами
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.09.2024",
                "Apple Inc.", "USA", 6499, false);
        productsArray[2] = new Product("Xiaomi 14", "10.01.2024",
                "Xiaomi", "China", 3999, true);
        productsArray[3] = new Product("Nokia G60", "20.05.2023",
                "HMD Global", "Finland", 2599, false);
        productsArray[4] = new Product("Pixel 8 Pro", "12.10.2023",
                "Google", "USA", 5299, true);

        // Выводим информацию о всех товарах
        for (Product product : productsArray) {
            System.out.println("----------------------------------");
            product.printProductInfo();
        }
    }
}
