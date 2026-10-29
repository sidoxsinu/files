import java.util.Scanner;

class InvalidUserException extends Exception {
    InvalidUserException(String msg) { super(msg); }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String msg) { super(msg); }
}

class Main {
    static void accessAccount(String u, String p) throws InvalidUserException, InvalidPasswordException {
        if (!u.equals("admin")) throw new InvalidUserException("Invalid username");
        if (!p.equals("1234")) throw new InvalidPasswordException("Invalid password");
        System.out.println("Login successful");
    }

    static void validateUser(String u, String p) throws InvalidUserException, InvalidPasswordException {
        accessAccount(u, p);
    }

    static void login(String u, String p) throws InvalidUserException, InvalidPasswordException {
        validateUser(u, p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("User: ");
            String u = sc.next();
            System.out.print("Pass: ");
            String p = sc.next();

            try {
                login(u, p);
                break;
            } catch (InvalidUserException e) {
                System.out.println(e.getMessage());
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
            }

            if (i == 3) System.out.println("Attempts exhausted");
        }
        sc.close();
    }
}
