abstract class Payment {
    int id;
    double amount;

    Payment(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    CreditCardPayment(int id, double amount) {
        super(id, amount);
    }

    void processPayment() {
        double fee = amount * 0.02;
        double reward = amount >= 5000 ? 100 : 0;
        System.out.println("Credit Card Final: " + (amount + fee - reward));
    }
}

class UPIPayment extends Payment {
    UPIPayment(int id, double amount) {
        super(id, amount);
    }

    void processPayment() {
        double fee = amount * 0.005;
        double cashback = amount >= 1000 ? 50 : 0;
        System.out.println("UPI Final: " + (amount + fee - cashback));
    }
}

class NetBankingPayment extends Payment {
    NetBankingPayment(int id, double amount) {
        super(id, amount);
    }

    void processPayment() {
        double fee = 20;
        double disc = amount >= 5000 ? 100 : 0;
        System.out.println("NetBanking Final: " + (amount + fee - disc));
    }
}

class Main {
    public static void main(String[] args) {
        Payment[] p = {
            new CreditCardPayment(1, 5000),
            new UPIPayment(2, 2000),
            new NetBankingPayment(3, 6000)
        };

        for (Payment pay : p) {
            pay.processPayment();
        }
    }
}
