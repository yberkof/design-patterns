package org.example.factory;

public class Dog extends Animal{
    public Dog(int legs, String name) {
        super(legs, name);
    }

    @Override
    public void makeASound() {
        System.out.println("Dog sound");
    }
}
