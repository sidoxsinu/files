package company.payroll;

import company.employee.Employee;

public class Manager extends Employee {
    double bonus = 5000;

    public Manager(int id, String name, double basic) {
        super(id, name, basic);
    }

    public double salary() { return getBasic() + bonus; }

    public void display() {
        System.out.println("Name: " + name + " Grade: " + grade + " Salary: " + salary());
    }
}
