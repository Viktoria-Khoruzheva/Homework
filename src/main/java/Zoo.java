import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;

public class Zoo {
    private static Aviary<Carnivorous> carnivorousAviary = fillCarnivorousAviary();
    private static Aviary<Herbivore> herbivoreAviary = fillHerbivoreAviary();

    public static void main(String[] args) {

        Deer deer = new Deer("Петр");
        Duck duck = new Duck("Лариса");
        Falcon falcon = new Falcon("Макс");
        Fish fish = new Fish("Толя");
        Kotik kotik = new Kotik("Стас");
        Rabbit rabbit = new Rabbit("Светлана");

        Grass grass = new Grass();
        Meat meat = new Meat();

        Worker worker = new Worker();

        worker.feed(deer, grass);
        worker.feed(deer, meat);
        worker.feed(falcon, grass);
        worker.feed(falcon, meat);
        worker.feed(fish, meat);
        worker.feed(rabbit, grass);
        worker.getVoice(duck);
        worker.getVoice(kotik);
        worker.getVoice(deer);
        worker.getVoice(falcon);

        rabbit.run();
        duck.fly();

        for (Swim swim : createPond()) {
            swim.swim();
        }

        Carnivorous animal1 = getCarnivorous("Макс");
        System.out.println(animal1);
        Herbivore animal2 = getHerbivorous("Лариса");
        System.out.println(animal2);
        System.out.println(carnivorousAviary.removeAnimal("Макс"));
    }

    public static Swim[] createPond() {
        Swim[] swims = new Swim[5];
        swims[0] = new Duck("Гоша");
        swims[1] = new Duck("Нина");
        swims[2] = new Fish("Гуля");
        swims[3] = new Fish("Жора");
        swims[4] = new Fish("Зина");
        return swims;
    }

    private static Aviary<Carnivorous> fillCarnivorousAviary() {
        Fish fish = new Fish("Толя");
        Falcon falcon = new Falcon("Макс");
        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.MEDIUM);
        carnivorousAviary.addAnimal(fish);
        carnivorousAviary.addAnimal(falcon);
        return carnivorousAviary;
    }

    private static Aviary<Herbivore> fillHerbivoreAviary() {
        Duck duck = new Duck("Лариса");
        Rabbit rabbit = new Rabbit("Светлана");
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.SMALL);
        herbivoreAviary.addAnimal(duck);
        herbivoreAviary.addAnimal(rabbit);
        return herbivoreAviary;
    }

    private static Carnivorous getCarnivorous(String name) {
        return carnivorousAviary.getAnimal(name);
    }

    private static Herbivore getHerbivorous(String name) {
        return herbivoreAviary.getAnimal(name);
    }
}
