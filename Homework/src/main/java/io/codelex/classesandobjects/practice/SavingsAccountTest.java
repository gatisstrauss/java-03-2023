package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money is in the account?:");
        double initialBalance = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(initialBalance);
        System.out.println("Enter the annual interest rate:");
        double annualInterestRate = scanner.nextDouble();

        savingsAccount.setAnnualInterest(annualInterestRate);
        System.out.println("How long has the account been open?:");
        int months = scanner.nextInt();

        double totalAdd = 0.0;
        double totalWithdraw = 0.0;
        double totalInterest = 0.0;

        for (int i = 1; i <= months; i++) {
            System.out.println("Enter the amount deposited in month: " + i + ": ");
            double depositedAmount = scanner.nextDouble();
            savingsAccount.addToBalance(depositedAmount);
            totalAdd += depositedAmount;

            System.out.println("Enter the amount withdrawn in month: " + i + ": ");
            double withdrawnAmount = scanner.nextDouble();
            savingsAccount.withdraw(withdrawnAmount);
            totalWithdraw += withdrawnAmount;

            savingsAccount.addMonthlyInterest();
            totalInterest += (savingsAccount.getBalance()) * (annualInterestRate / 12);
        }
        double endingBalance = savingsAccount.getBalance();

        System.out.println("Total deposits: $" + totalAdd);
        System.out.println("Total withdrawals: $" + totalWithdraw);
        System.out.println("Interest earned: $" + totalInterest);
        System.out.println("Ending balance: $" + endingBalance);
    }
}
