class Staff {
    int id;
    String name;
    double basic;

    Staff(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }

    double calculateSalary() {
        return basic;
    }

    void display() {
        System.out.println(name + " Salary: " + calculateSalary());
    }
}

class Professor extends Staff {
    Professor(int id, String name, double basic) {
        super(id, name, basic);
    }

    double calculateSalary() {
        return basic + basic * 0.20 + basic * 0.10 + 5000;
    }
}

class LabAssistant extends Staff {
    LabAssistant(int id, String name, double basic) {
        super(id, name, basic);
    }

    double calculateSalary() {
        return basic + basic * 0.15 + 2000;
    }
}

class Clerk extends Staff {
    Clerk(int id, String name, double basic) {
        super(id, name, basic);
    }

    double calculateSalary() {
        return basic + basic * 0.10 + 1000;
    }
}

class Main {
    public static void main(String[] args) {
        Staff s1 = new Professor(1, "Arun", 40000);
        Staff s2 = new LabAssistant(2, "Anu", 20000);
        Staff s3 = new Clerk(3, "Ravi", 15000);
        s1.display();
        s2.display();
        s3.display();
    }
}
