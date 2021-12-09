package animals;

public class Rabbit extends Herbivore implements Run {


    @Override
    public void run() {
        System.out.println("Кролик бежит");
    }

}
