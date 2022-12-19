package org.example;

import org.example.factory.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Animal");
            String name = scanner.next();
            Animal byName = Animal.AnimalFactory.getByName(name, 4);
            byName.makeASound();

        }

    }
}