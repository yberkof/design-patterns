package org.example.factory;

public class NoSuchAnimal extends RuntimeException {
    NoSuchAnimal(String message) {
        super(message);
    }
}
