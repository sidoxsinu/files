import java.util.Scanner;

class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter colour (RED/YELLOW/GREEN): ");
        String c = sc.next().toUpperCase();

        switch (c) {
            case "RED":
                System.out.println("STOP");
                break;
            case "YELLOW":
                System.out.println("READY");
                break;
            case "GREEN":
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid colour");
        }
        sc.close();
    }
}
