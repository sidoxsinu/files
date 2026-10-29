package hospital.patient;

public class Patient {
    private int recordNo;
    String category = "General";
    protected double treatment = 0;
    public String name;

    public Patient(int id, String name) {
        recordNo = id;
        this.name = name;
    }

    public int getRecordNo() { return recordNo; }
    public void addCharge(double a) { treatment += a; }
}
