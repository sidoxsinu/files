class BankAccount {
    int accNo;
    String name;
    double balance;

    BankAccount(int a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, "Arun", 5000);
        b.display();
        b.deposit(1000);
        b.withdraw(2000);
        b.withdraw(6000);
        b.display();
    }
}
