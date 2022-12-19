package org.example.factory;

public class Cat extends Animal{
    public Cat(int legs, String name) {
        super(legs, name);
    }

    @Override
    public void makeASound() {
        System.out.println("Cat Sound");
    }
}
