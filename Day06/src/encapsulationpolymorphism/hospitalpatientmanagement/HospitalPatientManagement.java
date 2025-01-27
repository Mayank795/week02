package encapsulationpolymorphism.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalPatientManagement {

    public static void processPatients(List<Patient> patients) {
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.printf("Bill: %.2f\n", patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Medical Records: " + record.viewRecords());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("P001", "Alice", 30, 5);
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Surgery successful");

        OutPatient outPatient = new OutPatient("P002", "Bob", 45);
        outPatient.addRecord("Routine checkup");

        patients.add(inPatient);
        patients.add(outPatient);

        processPatients(patients);
    }
}

