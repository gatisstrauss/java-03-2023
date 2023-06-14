package io.codelex.javaadvancedtest.exercise1;

public class CreditCard extends Card {

    public CreditCard(int number, String owner, int ccv, double balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void addMoney(double amount) {
        super.balance += amount;
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new NotEnoughFundsException("Not enough funds");
        }
        if (balance > 100){
            displayWarning();
        }
    }

    @Override
    public void displayWarning() {
        System.out.println("Warning: You have less than a 100 Euros left");
    }
}
