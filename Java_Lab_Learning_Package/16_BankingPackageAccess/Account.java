package bank.accounts;

public class Account {
    private int accNo = 101, pin = 1234;
    String type = "Savings";
    protected double balance = 5000;
    public String name = "Arun";

    public int getAccNo() { return accNo; }
    public String getType() { return type; }
    public void deposit(double a) { balance += a; }
    public void withdraw(double a) {
        if (a <= balance) balance -= a;
        else System.out.println("Insufficient balance");
    }
}
