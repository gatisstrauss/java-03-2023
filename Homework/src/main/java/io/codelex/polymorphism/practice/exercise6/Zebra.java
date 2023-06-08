package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zzzz");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println("Zebra is eating vegetable");
            foodEaten += food.getQuantity();
        } else {
            System.out.println("Zebra can only eat vegetables");
        }
    }
}
