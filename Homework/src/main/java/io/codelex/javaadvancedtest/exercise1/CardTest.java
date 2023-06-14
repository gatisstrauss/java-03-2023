package io.codelex.javaadvancedtest.exercise1;

public class CardTest {
    public static void main(String[] args) {

        try {
            CreditCard creditCard = new CreditCard(123456, "Gatis", 233, 1100.0);
            DebitCard debitCard = new DebitCard(1234567, "Gatis", 021, 520.0);

            creditCard.takeMoney(100);
            debitCard.takeMoney(20);

            creditCard.addMoney(15);
            debitCard.addMoney(20);

            System.out.println("Credit card balance " + creditCard.balance);
            System.out.println("Debit card balance " + debitCard.balance);


        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
