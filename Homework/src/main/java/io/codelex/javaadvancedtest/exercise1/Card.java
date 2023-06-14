package io.codelex.javaadvancedtest.exercise1;

public abstract class Card {

    private final int number;
    private final String owner;
    private final int ccv;
    protected double balance;

    public Card(int number, String owner, int ccv, double balance) {
        this.number = number;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }

    public abstract void addMoney(double amount);
    public abstract void takeMoney(double amount) throws NotEnoughFundsException;
    public abstract void displayWarning();

    public int getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public int getCcv() {
        return ccv;
    }

    public double getBalance() {
        return balance;
    }
}
