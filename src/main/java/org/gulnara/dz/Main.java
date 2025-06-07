package org.gulnara.dz;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {
        // Создаем объект товара
        Product product = new Product(
                "Смартфон XYZ",
                LocalDate.of(2023, 10, 15),
                "TechCorp",
                "Китай",
                59999.99,
                true
        );

               product.printProductInfo();
    }
}
