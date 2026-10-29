class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) { super(msg); }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) { super(msg); }
}

class BankAccount {
    double balance = 5000;

    void deposit(double a) throws InvalidAmountException {
        if (a <= 0) throw new InvalidAmountException("Invalid deposit amount");
        balance += a;
    }

    void withdraw(double a) throws InvalidAmountException, InsufficientBalanceException {
        if (a <= 0) throw new InvalidAmountException("Invalid withdrawal amount");
        if (a > balance) throw new InsufficientBalanceException("Insufficient balance");
        balance -= a;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        try {
            b.deposit(1000);
            b.withdraw(7000);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final Balance: " + b.balance);
        }
    }
}
