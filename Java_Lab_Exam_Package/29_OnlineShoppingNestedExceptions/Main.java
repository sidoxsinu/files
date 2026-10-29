import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidProductException extends Exception {
    InvalidProductException(String msg) { super(msg); }
}

class InsufficientPaymentException extends Exception {
    InsufficientPaymentException(String msg) { super(msg); }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            try {
                System.out.print("Product ID (101 or 102): ");
                int id = sc.nextInt();
                if (id != 101 && id != 102) throw new InvalidProductException("Product ID not found");

                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                if (qty <= 0) throw new IllegalArgumentException("Quantity must be > 0");

                System.out.print("Price: ");
                double price = sc.nextDouble();
                if (price <= 0) throw new IllegalArgumentException("Price must be > 0");

                double total = qty * price;
                System.out.println("Total: " + total);

                System.out.print("Payment: ");
                double pay = sc.nextDouble();
                if (pay < total) throw new InsufficientPaymentException("Insufficient payment");

                System.out.println("Payment Success. Balance: " + (pay - total));

            } catch (InvalidProductException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InsufficientPaymentException e) {
                System.out.println(e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid numeric input");
        } finally {
            System.out.println("Order processing completed");
            sc.close();
        }
    }
}
