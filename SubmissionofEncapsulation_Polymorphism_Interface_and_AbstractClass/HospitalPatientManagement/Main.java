package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.HospitalPatientManagement;

public class Main {
    public static void main(String[] args) {
        Patient[] patients = {
                new InPatient(401, "Eve", 45, 5, 500),
                new OutPatient(402, "Frank", 60, 150)
        };

        for (Patient p : patients) {
            System.out.println("-------------------------");
            p.getPatientDetails();
            System.out.println("Total Bill: $" + p.calculateBill());

            if (p instanceof InPatient) {
                InPatient inPatient = (InPatient) p;
                inPatient.addRecord("Admitted for observation.");
                inPatient.addRecord("Condition stable.");
                inPatient.viewRecords();
            }
        }
    }
}
