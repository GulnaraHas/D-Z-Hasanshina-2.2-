package org.gulnara.dz;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    // Конструктор парка
    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }



    // Метод для добавления аттракциона в парк
    public void addAttraction(String name, String workingHours, double price) {
        Attraction newAttraction = new Attraction(name, workingHours, price);
        attractions.add(newAttraction);
    }

    // Метод для вывода информации о всех аттракционах
    public void displayAllAttractions() {
        System.out.println("Парк: " + parkName);
        System.out.println("Список аттракционов:");
        for (Attraction attraction : attractions) {
            attraction.displayInfo();
        }
    }


}
