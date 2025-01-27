package encapsulationpolymorphism.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

class OutPatient extends Patient implements MedicalRecord {
    private static final double CONSULTATION_FEE = 500.0;
    private List<String> medicalRecords;

    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return CONSULTATION_FEE;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(medicalRecords);
    }
}

