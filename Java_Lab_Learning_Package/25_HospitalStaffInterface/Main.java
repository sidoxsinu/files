interface MedicalStaff {
    void performDuty();
    double calculateSalary();
}

interface EmergencyDuty {
    void performEmergencyDuty();
}

class Doctor implements MedicalStaff {
    String name;
    double salary;

    Doctor(String n, double s) { name = n; salary = s; }
    public void performDuty() { System.out.println(name + " treats patients"); }
    public double calculateSalary() { return salary; }
}

class Nurse implements MedicalStaff {
    String name;
    double salary;

    Nurse(String n, double s) { name = n; salary = s; }
    public void performDuty() { System.out.println(name + " cares for patients"); }
    public double calculateSalary() { return salary; }
}

class EmergencyDoctor implements MedicalStaff, EmergencyDuty {
    String name;
    double salary;

    EmergencyDoctor(String n, double s) { name = n; salary = s; }
    public void performDuty() { System.out.println(name + " treats patients"); }
    public double calculateSalary() { return salary; }
    public void performEmergencyDuty() { System.out.println(name + " handles emergency"); }
}

class Main {
    public static void main(String[] args) {
        MedicalStaff d = new Doctor("Arun", 50000);
        MedicalStaff n = new Nurse("Anu", 25000);
        EmergencyDoctor e = new EmergencyDoctor("Ravi", 60000);

        d.performDuty();
        System.out.println("Salary: " + d.calculateSalary());

        n.performDuty();
        System.out.println("Salary: " + n.calculateSalary());

        e.performDuty();
        e.performEmergencyDuty();
        System.out.println("Salary: " + e.calculateSalary());
    }
}
