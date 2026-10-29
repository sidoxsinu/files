class Employee {
    int id;
    String name;
    double basic, allowance;

    Employee(int i, String n, double b) {
        id = i;
        name = n;
        basic = b;
        allowance = basic * 0.20;
    }

    double grossSalary() {
        return basic + allowance;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic: " + basic);
        System.out.println("Allowance: " + allowance);
        System.out.println("Gross: " + grossSalary());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Arun", 20000);
        Employee e2 = new Employee(2, "Anu", 30000);
        e1.display();
        e2.display();
    }
}
