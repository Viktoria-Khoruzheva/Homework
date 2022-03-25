package animals;

import model.Size;

import static model.Size.SMALL;

public class Rabbit extends Herbivore implements Run {

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Кролик бежит");
    }

    @Override
    public Size getSize() {
        return SMALL;
    }
}
