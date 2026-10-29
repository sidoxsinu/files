package bank.services;

import bank.accounts.Account;

public class SavingsAccount extends Account {
    public void show() {
        System.out.println("Subclass access: name=" + name + ", balance=" + balance);
    }
}
