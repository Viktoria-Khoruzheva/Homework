package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            int satiety = getSatiety();
            int energy = food.getEnergy();
            setSatiety(satiety + energy);
            System.out.println("Сытость равна: " + getSatiety());
        } else {
            throw new WrongFoodException("Хищники не едят траву");
        }
    }
}
