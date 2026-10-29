class HospitalPerson {
    int id;
    String name;

    HospitalPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Staff extends HospitalPerson {
    double salary;

    Staff(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }
}

class Doctor extends Staff {
    int patients;

    Doctor(int id, String name, double salary, int patients) {
        super(id, name, salary);
        this.patients = patients;
    }

    void display() {
        System.out.println("Doctor: " + name + " Total: " + (salary + patients * 500));
    }
}

class Nurse extends Staff {
    int shifts;

    Nurse(int id, String name, double salary, int shifts) {
        super(id, name, salary);
        this.shifts = shifts;
    }

    void display() {
        System.out.println("Nurse: " + name + " Total: " + (salary + shifts * 300));
    }
}

class Patient extends HospitalPerson {
    double room, treatment;

    Patient(int id, String name, double room, double treatment) {
        super(id, name);
        this.room = room;
        this.treatment = treatment;
    }

    void display() {
        System.out.println("Patient: " + name + " Bill: " + (room + treatment));
    }
}

class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor(1, "Arun", 50000, 10);
        Nurse n = new Nurse(2, "Anu", 25000, 5);
        Patient p = new Patient(3, "Ravi", 3000, 5000);
        d.display();
        n.display();
        p.display();
    }
}
