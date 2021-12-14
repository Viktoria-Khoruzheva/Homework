package animals;

import model.Size;

import static model.Size.MEDIUM;

public class Falcon extends Carnivorous implements Run, Fly, Voice {


    public Falcon(String name) {
        super(name);
    }

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

    @Override
    public Size getSize() {
        return MEDIUM;
    }
}
