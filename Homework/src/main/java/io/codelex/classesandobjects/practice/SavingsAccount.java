package io.codelex.classesandobjects.practice;

public class SavingsAccount {
    double annualInterest;
    double balance;

    public SavingsAccount(double startingBalance) {
        balance = startingBalance;
        annualInterest = 0.0;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void addToBalance(double amount) {
        balance += amount;
    }

    public void addMonthlyInterest() {
        double monthlyInterest = (annualInterest / 12) * balance;
        balance += monthlyInterest;
    }

}
