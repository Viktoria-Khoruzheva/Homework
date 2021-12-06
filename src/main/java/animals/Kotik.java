package main.java.animals;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
    private final int METHODS = 5;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        Kotik.count++;
    }

    public Kotik() {
        Kotik.count++;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
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

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void setCount(int count) {
        Kotik.count = count;
    }

    public boolean play() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    public void eat(int satiety) {
        this.satiety = this.satiety + satiety;
    }

    public void eat(int satiety, String food) {
        eat(satiety);
    }

    public void eat() {
        eat(4, "корм");
    }

    public String[] liveAnotherDay() {
        String[] actions = new String[24];
        for (int i = 0; i < 24; i++) {
            int random = (int) (Math.random() * METHODS) + 1;
            switch (random) {
                case 1:
                    if (play()) {
                        actions[i] = i + " - играл";
                    } else {
                        actions[i] = i + " - ел";
                        eat();
                    }
                    break;
                case 2:
                    if (sleep()) {
                        actions[i] = i + " - спал";
                    } else {
                        actions[i] = i + " - ел";
                        eat();
                    }
                    break;
                case 3:
                    if (wash()) {
                        actions[i] = i + " - умывался";
                    } else {
                        actions[i] = i + " - ел";
                        eat();
                    }
                    break;
                case 4:
                    if (walk()) {
                        actions[i] = i + " - гулял";
                    } else {
                        actions[i] = i + " - ел";
                        eat();
                    }
                    break;
                case 5:
                    if (hunt()) {
                        actions[i] = i + " - охотился";
                    } else {
                        actions[i] = i + " - ел";
                        eat();
                    }
                    break;

            }
        }
        return actions;
    }

}