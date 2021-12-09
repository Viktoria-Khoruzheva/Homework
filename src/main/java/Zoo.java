import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Deer deer = new Deer();
        Duck duck = new Duck();
        Falcon falcon = new Falcon();
        Fish fish = new Fish();
        Kotik kotik = new Kotik();
        Rabbit rabbit = new Rabbit();

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

    }

    public static Swim[] createPond() {
        Swim[] swims = new Swim[5];
        swims[0] = new Duck();
        swims[1] = new Duck();
        swims[2] = new Fish();
        swims[3] = new Fish();
        swims[4] = new Fish();
        return swims;

    }
}
