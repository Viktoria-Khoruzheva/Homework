package animals;

import model.Size;

import static model.Size.LARGE;

public class Deer extends Herbivore implements Run, Voice {


    public Deer(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Олень бежит");
    }

    @Override
    public String getVoice() {
        return "м-м-бе";
    }

    @Override
    public Size getSize() {
        return LARGE;
    }
}
