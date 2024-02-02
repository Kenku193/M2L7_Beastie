package org.example;

public class Main2 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        Class<? extends Fish> aClass = fish.getClass();
        System.out.println(aClass);

        if (fish.getClass().equals(cat.getClass())){
            System.out.println("wow!!!!");
        }
        else {
            System.out.println("nononono!!!");
        }

    }
}
