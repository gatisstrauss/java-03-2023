package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    private final String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat(Food food) {
        System.out.println("Cat is eating");
        foodEaten += food.getQuantity();
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %.1f, %d]", animalType, animalName, breed, animalWeight, foodEaten);
    }
}