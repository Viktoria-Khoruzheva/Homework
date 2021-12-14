package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public abstract class Animal {
    private int satiety;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public abstract Size getSize();
}
