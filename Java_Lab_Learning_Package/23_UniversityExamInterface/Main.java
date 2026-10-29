interface Evaluatable {
    int calculateTotal();
    double calculateAverage();
    String calculateGrade();
}

interface Reportable {
    void generateReport();
}

class EngineeringStudent implements Evaluatable, Reportable {
    int theory, lab;

    EngineeringStudent(int t, int l) {
        theory = t;
        lab = l;
    }

    public int calculateTotal() { return theory + lab; }
    public double calculateAverage() { return calculateTotal() / 2.0; }
    public String calculateGrade() { return calculateAverage() >= 80 ? "A" : "B"; }

    public void generateReport() {
        System.out.println("Engineering Total: " + calculateTotal() + " Avg: " + calculateAverage() + " Grade: " + calculateGrade());
    }
}

class ManagementStudent implements Evaluatable, Reportable {
    int theory, project;

    ManagementStudent(int t, int p) {
        theory = t;
        project = p;
    }

    public int calculateTotal() { return theory + project; }
    public double calculateAverage() { return calculateTotal() / 2.0; }
    public String calculateGrade() { return calculateAverage() >= 70 ? "A" : "B"; }

    public void generateReport() {
        System.out.println("Management Total: " + calculateTotal() + " Avg: " + calculateAverage() + " Grade: " + calculateGrade());
    }
}

class Main {
    public static void main(String[] args) {
        Reportable a = new EngineeringStudent(85, 90);
        Reportable b = new ManagementStudent(75, 80);
        a.generateReport();
        b.generateReport();
    }
}
