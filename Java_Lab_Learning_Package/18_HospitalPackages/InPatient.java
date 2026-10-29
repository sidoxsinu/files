package hospital.staff;

import hospital.patient.Patient;

public class InPatient extends Patient {
    public InPatient(int id, String name) { super(id, name); }
    public double bill() { return treatment + 2000; }
}
