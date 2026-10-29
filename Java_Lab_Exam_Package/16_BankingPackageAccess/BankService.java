package bank.services;

import bank.accounts.Account;

public class BankService {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println("Public name: " + a.name);
        System.out.println("Private accNo via getter: " + a.getAccNo());
        System.out.println("Default type via getter: " + a.getType());
        a.deposit(1000);
        a.withdraw(2000);

        SavingsAccount s = new SavingsAccount();
        s.show();
    }
}
