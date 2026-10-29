class Account {
    double balance;

    Account(double b) {
        balance = b;
    }

    void deposit(double a) {
        balance += a;
    }

    void withdraw(double a) {
        if (a <= balance) balance -= a;
        else System.out.println("Insufficient balance");
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double b) {
        super(b);
    }

    double interest() {
        return balance * 0.05;
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    PremiumSavingsAccount(double b) {
        super(b);
    }

    double loyaltyBenefit() {
        return balance >= 50000 ? 1000 : 0;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(double b) {
        super(b);
    }

    void checkMinimum() {
        if (balance < 10000) {
            balance -= 500;
            System.out.println("Penalty applied: 500");
        }
    }
}

class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(20000);
        System.out.println("Savings Interest: " + s.interest());

        PremiumSavingsAccount p = new PremiumSavingsAccount(60000);
        System.out.println("Loyalty Benefit: " + p.loyaltyBenefit());

        CurrentAccount c = new CurrentAccount(8000);
        c.checkMinimum();
        c.display();
    }
}
