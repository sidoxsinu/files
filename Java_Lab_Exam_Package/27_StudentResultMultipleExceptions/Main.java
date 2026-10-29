import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        try {
            System.out.println("Enter 5 marks:");
            for (int i = 0; i < 5; i++) {
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 100)
                    throw new IllegalArgumentException("Marks must be between 0 and 100");
            }

            System.out.print("Enter index to check: ");
            int idx = sc.nextInt();
            System.out.println("Mark: " + marks[idx]);

            int total = 0;
            for (int m : marks) total += m;

            System.out.print("Enter count to divide: ");
            int count = sc.nextInt();
            int avg = total / count;
            System.out.println("Total: " + total + " Average: " + avg);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (InputMismatchException e) {
            System.out.println("Enter numbers only");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Result processing completed");
            sc.close();
        }
    }
}
