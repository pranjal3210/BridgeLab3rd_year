package this_static_final_key_words_and_instanceof_Operator.HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {
        ConsoleDisplayService displayService = new ConsoleDisplayService();

        // Set the hospital name
        HospitalService.setHospitalName("City Hospital");

        // Create new patient instances
        Patient patient1 = new Patient("Ayush", 30, "Flu", "P001");
        HospitalService.admitPatient();
        Patient patient2 = new Patient("Anshitva", 45, "Fracture", "P002");
        HospitalService.admitPatient();

        displayService.displayTotalPatients();
        System.out.println();

        // Display patient details
        displayService.displayPatientDetails(patient1);
        System.out.println();
        displayService.displayPatientDetails(patient2);
    }
}
