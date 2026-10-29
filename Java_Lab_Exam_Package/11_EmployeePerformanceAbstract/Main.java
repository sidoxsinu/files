abstract class Employee {
    int id;
    String name;
    double basic;

    Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println(name + " (" + id + ") Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    Manager(int id, String name, double basic) {
        super(id, name, basic);
    }

    double calculateSalary() {
        return basic + basic * 0.20 + basic * 0.10 + 5000;
    }
}

class Developer extends Employee {
    Developer(int id, String name, double basic) {
        super(id, name, basic);
    }

    double calculateSalary() {
        return basic + basic * 0.20 + basic * 0.10 + 3000;
    }
}

class Intern extends Employee {
    Intern(int id, String name, double basic) {
        super(id, name, basic);
    }

    double calculateSalary() {
        return basic + 1000;
    }
}

class Main {
    public static void main(String[] args) {
        Employee[] e = {
            new Manager(1, "Arun", 40000),
            new Developer(2, "Anu", 30000),
            new Intern(3, "Ravi", 10000)
        };

        for (Employee emp : e) {
            emp.display();
        }
    }
}
