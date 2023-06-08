package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Tiger is eating meat");
            foodEaten += food.getQuantity();
        } else {
            System.out.println("Tiger can only eat meat");
        }
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %.1f, %s, %d]", animalType, animalName, animalWeight, livingRegion, foodEaten);
    }
}
