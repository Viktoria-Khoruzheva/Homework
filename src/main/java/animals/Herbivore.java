package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            int satiety = getSatiety();
            int energy = food.getEnergy();
            setSatiety(satiety + energy);
            System.out.println("Сытость равна: " + getSatiety());
        } else {
            throw new WrongFoodException("Травоядные не едят мясо");
        }
    }
}
