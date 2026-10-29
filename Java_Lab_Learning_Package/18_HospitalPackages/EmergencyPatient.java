package hospital.staff;

import hospital.patient.Patient;

public class EmergencyPatient extends Patient {
    public EmergencyPatient(int id, String name) { super(id, name); }
    public double bill() { return treatment + 5000; }
}
