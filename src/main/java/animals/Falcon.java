package animals;

public class Falcon extends Carnivorous implements Run, Fly, Voice {


    @Override
    public void fly() {
        System.out.println("Сокол летит");

    }

    @Override
    public void run() {
        System.out.println("Сокол бежит");


    }

    @Override
    public String getVoice() {
        return "киивь-киивь";
    }
}
