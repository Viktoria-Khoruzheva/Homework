package animals;

import food.Meat;
import food.WrongFoodException;
import model.Size;

import static model.Size.SMALL;

public class Kotik extends Carnivorous implements Run, Voice {
    private String name;
    private String voice = "мяу";
    private int weight;
    private static int count;
    private final static int METHODS = 5;

    public Kotik(String name, String voice, int weight) {
        super(name);
        this.voice = voice;
        this.weight = weight;
        Kotik.count++;
    }

    public Kotik(String name) {
        super(name);
        Kotik.count++;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }


    public int getWeight() {
        return weight;
    }

    public static int getCount() {

        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    private boolean play() {
        if (getSatiety() > 0) {
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            return false;
        }
    }

    private boolean sleep() {
        if (getSatiety() > 0) {
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            return false;
        }
    }

    private boolean wash() {
        if (getSatiety() > 0) {
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            return false;
        }
    }

    private boolean walk() {
        if (getSatiety() > 0) {
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            return false;
        }
    }

    private boolean hunt() {
        if (getSatiety() > 0) {
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            return false;
        }
    }


    public String[] liveAnotherDay() {
        String[] actions = new String[24];
        Meat meat = new Meat();
        for (int i = 0; i < 24; i++) {
            int random = (int) (Math.random() * METHODS) + 1;
            switch (random) {
                case 1:
                    if (play()) {
                        actions[i] = i + " - играл";
                    } else {
                        actions[i] = i + " - ел";
                        try {
                            eat(meat);
                        } catch (WrongFoodException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    if (sleep()) {
                        actions[i] = i + " - спал";
                    } else {
                        actions[i] = i + " - ел";
                        try {
                            eat(meat);
                        } catch (WrongFoodException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    if (wash()) {
                        actions[i] = i + " - умывался";
                    } else {
                        actions[i] = i + " - ел";
                        try {
                            eat(meat);
                        } catch (WrongFoodException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 4:
                    if (walk()) {
                        actions[i] = i + " - гулял";
                    } else {
                        actions[i] = i + " - ел";
                        try {
                            eat(meat);
                        } catch (WrongFoodException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 5:
                    if (hunt()) {
                        actions[i] = i + " - охотился";
                    } else {
                        actions[i] = i + " - ел";
                        try {
                            eat(meat);
                        } catch (WrongFoodException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

            }
        }
        return actions;
    }

    @Override
    public void run() {
        System.out.println("Котик бежит");
    }

    @Override
    public Size getSize() {
        return SMALL;
    }
}
