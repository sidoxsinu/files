import java.util.Scanner;

class InvalidPatientException extends Exception {
    InvalidPatientException(String msg) { super(msg); }
}

class InvalidChargeException extends Exception {
    InvalidChargeException(String msg) { super(msg); }
}

class PaymentException extends Exception {
    PaymentException(String msg) { super(msg); }
}

class Main {
    static void validatePatient(int id) throws InvalidPatientException {
        if (id <= 0) throw new InvalidPatientException("Invalid patient ID");
    }

    static double calculateBill(double t, double m, double r) throws InvalidChargeException {
        if (t < 0 || m < 0 || r < 0) throw new InvalidChargeException("Negative charges not allowed");
        return t + m + r;
    }

    static void processPayment(double total, double paid) throws PaymentException {
        if (paid < total) throw new PaymentException("Pending amount: " + (total - paid));
        System.out.println("Balance returned: " + (paid - total));
    }

    static void generateBill(int id, double t, double m, double r, double paid)
            throws InvalidPatientException, InvalidChargeException, PaymentException {
        validatePatient(id);
        double total = calculateBill(t, m, r);
        System.out.println("Total Bill: " + total);
        processPayment(total, paid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Patient ID: ");
            int id = sc.nextInt();
            System.out.print("Treatment: ");
            double t = sc.nextDouble();
            System.out.print("Medicine: ");
            double m = sc.nextDouble();
            System.out.print("Room: ");
            double r = sc.nextDouble();
            System.out.print("Amount paid: ");
            double paid = sc.nextDouble();

            generateBill(id, t, m, r, paid);

        } catch (InvalidPatientException e) {
            System.out.println(e.getMessage());
        } catch (InvalidChargeException e) {
            System.out.println(e.getMessage());
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Billing process completed");
            sc.close();
        }
    }
}
