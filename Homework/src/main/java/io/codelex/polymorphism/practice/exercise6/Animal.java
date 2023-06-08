package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }
    public double getAnimalWeight() {
        return animalWeight;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    private void printErrorMessage() {
        System.out.println(this.getClass().getSimpleName() + "s aren't eating that type of food");
    }

    public String getFoodEatenString() {
        return String.valueOf(foodEaten);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s]", animalType, animalName, decimalFormat.format(animalWeight), foodEaten);
    }
}
