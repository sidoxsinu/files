abstract class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculateBill();

    void display() {
        System.out.println(name + " (" + id + ") Bill: " + calculateBill());
    }
}

class InPatient extends Patient {
    double room, treat, doc;
    int days;

    InPatient(int id, String name, double room, double treat, double doc, int days) {
        super(id, name);
        this.room = room;
        this.treat = treat;
        this.doc = doc;
        this.days = days;
    }

    double calculateBill() {
        return (room * days) + treat + doc;
    }
}

class OutPatient extends Patient {
    double consult, med;

    OutPatient(int id, String name, double consult, double med) {
        super(id, name);
        this.consult = consult;
        this.med = med;
    }

    double calculateBill() {
        return consult + med;
    }
}

class EmergencyPatient extends Patient {
    double treat, emerg, doc;

    EmergencyPatient(int id, String name, double treat, double emerg, double doc) {
        super(id, name);
        this.treat = treat;
        this.emerg = emerg;
        this.doc = doc;
    }

    double calculateBill() {
        return treat + emerg + doc;
    }
}

class Main {
    public static void main(String[] args) {
        Patient[] p = {
            new InPatient(1, "Arun", 2000, 3000, 1000, 2),
            new OutPatient(2, "Anu", 500, 300),
            new EmergencyPatient(3, "Ravi", 3000, 2000, 1000)
        };

        for (Patient pt : p) {
            pt.display();
        }
    }
}
