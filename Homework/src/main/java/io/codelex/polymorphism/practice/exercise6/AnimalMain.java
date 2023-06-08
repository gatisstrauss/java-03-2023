package io.codelex.polymorphism.practice.exercise6;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String animalInput = scanner.nextLine();
        while (!animalInput.equals("End")) {
            String[] animalInfo = animalInput.split("\\s+");
            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            double animalWeight = Double.parseDouble(animalInfo[2]);
            String animalLivingRegion = animalInfo[3];
            String catBreed = null;

            if (animalType.equals("Cat")) {
                catBreed = animalInfo[4];
            }

            Animal animal = switch (animalType) {
                case "Mouse" -> new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                case "Zebra" -> new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                case "Cat" -> new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
                case "Tiger" -> new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                default -> throw new IllegalArgumentException("Invalid animal type: " + animalType);
            };

            animals.add(animal);

            String foodInput = scanner.nextLine();
            String[] foodInfo = foodInput.split("\\s+");
            String foodType = foodInfo[0];
            int foodQuantity = Integer.parseInt(foodInfo[1]);

            Food food = switch (foodType) {
                case "Vegetable" -> new Vegetable(foodQuantity);
                case "Meat" -> new Meat(foodQuantity);
                default -> throw new IllegalArgumentException("Invalid food type: " + foodType);
            };

            animal.makeSound();
            animal.eat(food);

            animalInput = scanner.nextLine();
        }

        scanner.close();

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);

        for (Animal animal : animals) {
            String animalWeightFormatted = decimalFormat.format(animal.getAnimalWeight());
            System.out.println(animal + ", " + animalWeightFormatted);
        }
    }
}



