package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.HospitalPatientManagement;

abstract class Patient {
    // Encapsulated fields
    private int patientId;
    public String name;
    private int age;
    private String diagnosis; // Sensitive data

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method for billing
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getters and Setters for secured access
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
}
