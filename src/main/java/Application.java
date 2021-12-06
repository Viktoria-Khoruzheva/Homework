package src.main.java;

import main.java.animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Пушок", "мяу", 8, 3000);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Орешек");
        kotik2.setVoice("мяу");
        kotik2.setSatiety(0);
        kotik2.setWeight(5350);
        String[] actionsKotik1 = kotik1.liveAnotherDay();
        for (String action : actionsKotik1) {
            System.out.println(action);
        }
        System.out.println("имя: " + kotik2.getName() + ", вес: " + kotik2.getWeight());
        System.out.println(compareVoice(kotik1, kotik2));
        System.out.println(Kotik.getCount());
    }

    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        if (kotik1.getVoice() == null) {
            return false;
        }
        return kotik1.getVoice().equals(kotik2.getVoice());
    }
}
