package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal{

    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println("Mouse is eating vegetable");
            foodEaten += food.getQuantity();
        } else {
            System.out.println("Mouse can only eat vegetables");
        }
    }
}
