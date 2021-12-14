package animals;

import model.Size;

import static model.Size.SMALL;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {


    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывает в пруду");
    }

    @Override
    public String getVoice() {
        return "кря";
    }

    @Override
    public Size getSize() {
        return SMALL;
    }
}
