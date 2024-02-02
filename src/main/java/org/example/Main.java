package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        Object o = new Cat();
        Cat c = (Cat) o;

        System.out.println(animal instanceof Animal);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Object);

        System.out.println(fish instanceof Animal);
        System.out.println(fish instanceof SomeInterface);

        Integer a = null;
        System.out.println(a instanceof Integer);

    }
}