package io.codelex.arithmetic.practice;

public class Exercise9 {
    public static void calculator(double weight, double height){
        double BMI = weight / Math.pow(height, 2);

        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("Optimal BMI");
        } else if (BMI >= 0 && BMI <= 18.5) {
            System.out.println("The person is underweight");
        } else if (BMI >= 25) {
            System.out.println("The person is overweight");
        }
    }

    public static void main(String[] args) {
        calculator(90.0, 2.00);
        calculator(150.3, 1.50);
        calculator(69.7, 1.75);
        calculator(45.5, 1.30);
        calculator(110.0, 2.14);
        calculator(100.4, 2.20);
    }


}
