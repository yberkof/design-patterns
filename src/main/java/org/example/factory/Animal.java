package org.example.factory;

public abstract class Animal {
    private int legs;
    private String name;

    public Animal(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public String getName() {
        return name;
    }
    public abstract void makeASound();
}
