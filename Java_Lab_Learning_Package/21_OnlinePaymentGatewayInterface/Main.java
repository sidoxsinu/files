interface Payment {
    void processPayment(double a);
    void generateReceipt();
}

interface Refundable {
    void processRefund(double a);
}

class CreditCardPayment implements Payment, Refundable {
    public void processPayment(double a) { System.out.println("Card Payment: " + a); }
    public void generateReceipt() { System.out.println("Card receipt generated"); }
    public void processRefund(double a) { System.out.println("Card Refund: " + a); }
}

class UPIPayment implements Payment, Refundable {
    public void processPayment(double a) { System.out.println("UPI Payment: " + a); }
    public void generateReceipt() { System.out.println("UPI receipt generated"); }
    public void processRefund(double a) { System.out.println("UPI Refund: " + a); }
}

class NetBankingPayment implements Payment, Refundable {
    public void processPayment(double a) { System.out.println("NetBanking Payment: " + a); }
    public void generateReceipt() { System.out.println("NetBanking receipt generated"); }
    public void processRefund(double a) { System.out.println("NetBanking Refund: " + a); }
}

class Main {
    public static void main(String[] args) {
        Payment p = new UPIPayment();
        p.processPayment(1000);
        p.generateReceipt();

        Refundable r = (Refundable) p;
        r.processRefund(500);
    }
}
