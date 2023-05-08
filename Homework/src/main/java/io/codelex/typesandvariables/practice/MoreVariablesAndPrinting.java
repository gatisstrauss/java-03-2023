package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        double height;
        double weight;


        name = "Zed A. Shaw";
        age = 35;
        height = Math.round(74 * 2.54)*10.0/10.0;  // centimeters
        weight = Math.round(180 * 0.453592)*10.0/10.0; // kilograms
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " centimeters tall.");
        System.out.println("He's " + weight + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}