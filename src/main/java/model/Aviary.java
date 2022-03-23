package model;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;



public class Aviary<T extends Animal> {
    private Size size;
    private HashMap<String, T> aviaryMap = new HashMap<>();

    public Aviary(Size size) {
        this.size = size;
    }

    public <A extends T> void addAnimal(A animal) {
        if (size == animal.getSize()) {
            aviaryMap.put(animal.getName(), animal);
        } else {
            throw new WrongSizeException("Вольер меньше животного");
        }
    }

    public <A extends T> T getAnimal(String name) {
        return aviaryMap.get(name);
    }

    public <A extends T> boolean removeAnimal(String name) {
        if (aviaryMap.containsKey(name)) {
            aviaryMap.remove(name);
            return true;
        } else {
            return false;
        }
    }
}


