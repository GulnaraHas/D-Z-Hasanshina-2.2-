package org.gulnara.dz;
public class Main {
    public static void main(String[] args) {
        // Создаем животных
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Васька");

        // Тестируем бег и плавание
        dog1.run(400);
        dog1.run(600);
        dog1.swim(5);
        dog1.swim(15);

        cat1.run(150);
        cat1.run(250);
        cat1.swim(1);

        // Создаем миску и массив котов
        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2, cat3};

        // Кормим котов
        System.out.println("\nПытаемся накормить котов:");
        for (Cat cat : cats) {
            cat.eat(bowl, 15); // Каждый кот пытается съесть 15 единиц
        }

        // Проверяем сытость
        System.out.println("\nСостояние котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isFed() ? "сыт" : "голоден"));
        }

        // Добавляем еды и кормим снова
        System.out.println("\nДобавляем еды в миску:");
        bowl.addFood(20);

        for (Cat cat : cats) {
            if (!cat.isFed()) {
                cat.eat(bowl, 15);
            }
        }

        // Статистика
        System.out.println("\nСтатистика животных:");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
    }
}


