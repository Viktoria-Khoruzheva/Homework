package animals;

public class Deer extends Herbivore implements Run, Voice {


    @Override
    public void run() {
        System.out.println("Олень бежит");
    }

    @Override
    public String getVoice() {
        return "м-м-бе";
    }
}
