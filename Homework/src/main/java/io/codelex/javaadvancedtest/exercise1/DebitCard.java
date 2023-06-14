package io.codelex.javaadvancedtest.exercise1;

public class DebitCard extends Card {

    public DebitCard(int number, String owner, int ccv, double balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void addMoney(double amount) {
        balance += amount;
        if (balance > 10000) {
            displayWarning();
        }
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new NotEnoughFundsException("Not enough funds");
        }
    }

    @Override
    public void displayWarning() {
        System.out.println("Warning: You have more than 10k");
    }
}
