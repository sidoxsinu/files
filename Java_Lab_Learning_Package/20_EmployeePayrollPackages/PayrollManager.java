package company.management;

import company.payroll.Manager;

public class PayrollManager {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Arun", 30000);
        m.display();
        System.out.println("ID via getter: " + m.getId());
    }
}
