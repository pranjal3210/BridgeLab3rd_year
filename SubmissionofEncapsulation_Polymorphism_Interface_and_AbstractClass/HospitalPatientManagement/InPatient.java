package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.HospitalPatientManagement;

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double perDayCharge;
    private String records = "";

    public InPatient(int patientId, String name, int age, int daysAdmitted, double perDayCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.perDayCharge = perDayCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * perDayCharge;
    }

    @Override
    public void addRecord(String record) {
        this.records += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("--- Medical Records for " + super.name + " ---");
        System.out.println(records.isEmpty() ? "No records found." : records);
    }
}
