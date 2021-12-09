package animals;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {


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
}
