package io.codelex.arithmetic.practice;

public class Exercise8 {
    public static void calculator(double basePay, double hoursWorked) {
        if (hoursWorked > 60) {
            System.out.println("Error, the employee has worked more than 60 hours");
        } else if (basePay < 8.00) {
            System.out.println("Error, the employee is being paid less than the minimum wage");
        } else {
            double overtimeHours = hoursWorked - 40.0;
            double salary = 0.0;

            if (overtimeHours <= 0.0){
                salary = basePay * hoursWorked;
                System.out.println("Employee has worked " + hoursWorked + " hours and earned $" + salary);
            } else {
                salary = 40 * basePay + (overtimeHours * (basePay * 1.50));
                System.out.println("Employee has worked " + hoursWorked + " hours and earned $" + salary);
            }

        }
    }

    public static void main(String[] args) {
        calculator(7.50, 35);
        calculator(8.20, 47);
        calculator(10.00, 73);
    }
}

