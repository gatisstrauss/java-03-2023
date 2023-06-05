package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public final void deposit(double amount) {
        //todo
        balance += amount;
    }

    public final void withdraw(double amount) {
        //todo
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("No money");
        }
    }

    @Override
    public String toString() {
        String formattedBalance = String.valueOf(Math.abs(balance));
        if (balance >= 0) {
            return name + ", $" + formattedBalance;
        } else {
            return name + ", -$" + formattedBalance;
        }
    }

    public static void main(String[] args) {
        BankAccount gatis = new BankAccount("Gatis", 17.25);
        System.out.println(gatis);
        BankAccount negativeGatis = new BankAccount("Gatis", -29.76);
        System.out.println(negativeGatis);
    }
}
