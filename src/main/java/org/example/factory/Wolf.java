package org.example.factory;

public class Wolf extends Animal{
    public Wolf(int legs, String name) {
        super(legs, name);
    }

    @Override
    public void makeASound() {
        System.out.println("Wolf Sound");

    }
}
