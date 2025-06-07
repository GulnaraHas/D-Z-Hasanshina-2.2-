package org.gulnara.dz;

class Bowl {
    private int foodAmount;

    public Bowl(int initialAmount) {
        this.foodAmount = Math.max(initialAmount, 0); // Не допускаем отрицательное количество
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) return false;
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавили " + amount + " еды. Теперь в миске: " + foodAmount);
        }
    }

    public int getFoodAmount() {
        return foodAmount;
            }
        }