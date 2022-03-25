package animals;

import model.Size;

import static model.Size.MEDIUM;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Рыба плывает в пруду");
    }

    @Override
    public Size getSize() {
        return MEDIUM;
    }
}
