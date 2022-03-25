import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;



public class Zoo {
    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.MEDIUM);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.SMALL);

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

        fillCarnivorousAviary();
        fillHerbivoreAviary();
        Carnivorous animal1 = getCarnivorous("Макс");
        System.out.println(animal1);
        Herbivore animal2 = getHerbivore("Лариса");
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

    private static void fillCarnivorousAviary() {
        Fish fish = new Fish("Толя");
        Falcon falcon = new Falcon("Макс");
        carnivorousAviary.addAnimal(fish);
        carnivorousAviary.addAnimal(falcon);
    }

    private static void fillHerbivoreAviary() {
        Duck duck = new Duck("Лариса");
        Rabbit rabbit = new Rabbit("Светлана");
        herbivoreAviary.addAnimal(duck);
        herbivoreAviary.addAnimal(rabbit);
    }

    private static Carnivorous getCarnivorous(String name) {
        return carnivorousAviary.getAnimal(name);
    }

    private static Herbivore getHerbivore(String name) {
        return herbivoreAviary.getAnimal(name);
    }
}
