package org.gulnara.dz;

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFed;

    public Cat(String name) {
        super(name, 200, 0);
        this.isFed = false;
        catCount++;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFed = true;
            System.out.println(name + " поел из миски и теперь сыт");
        } else {
            System.out.println(name + " не стал есть - в миске недостаточно еды");
        }
    }

    public boolean isFed() {
        return isFed;
    }

    public static int getCatCount() {
        return catCount;
    }
}

