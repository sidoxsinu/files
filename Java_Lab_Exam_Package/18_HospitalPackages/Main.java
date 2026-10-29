package hospital.staff;

public class Main {
    public static void main(String[] args) {
        InPatient p = new InPatient(101, "Arun");
        p.addCharge(3000);
        System.out.println("Patient: " + p.name + " Bill: " + p.bill() + " RecordNo: " + p.getRecordNo());

        EmergencyPatient e = new EmergencyPatient(102, "Anu");
        e.addCharge(4000);
        System.out.println("Patient: " + e.name + " Bill: " + e.bill() + " RecordNo: " + e.getRecordNo());
    }
}
