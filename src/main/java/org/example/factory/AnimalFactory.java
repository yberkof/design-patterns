package org.example.factory;

public class AnimalFactory {
    public static Animal getByName(String name, int legs) {
        if (name.equals("Cat")) {
            return new Cat(legs, name);
        } else if (name.equals("Dog")) {
            return new Dog(legs, name);
        } else if (name.equals("Wolf")) {
            return new Wolf(legs, name);
        } else throw new NoSuchAnimal("No such animal like: " + name);
    }
}
