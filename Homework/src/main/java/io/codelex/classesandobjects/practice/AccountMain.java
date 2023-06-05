package io.codelex.classesandobjects.practice;

import static io.codelex.classesandobjects.practice.Account.transfer;

public class AccountMain {
    public static void main(String[] args) {
        Account someAccount = new Account("Some account", 100.00);
        someAccount.deposit(20.00);
        System.out.println(someAccount);

        Account mattAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("Gatis' account", 0.00);

        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(mattAccount);
        System.out.println(myAccount);

        Account accountA = new Account("A", 100.0);
        Account accountB = new Account("B", 0.0);
        Account accountC = new Account("C", 0.0);

        transfer(accountA, accountB, 50.0);
        transfer(accountB, accountC, 25.0);

        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }
}