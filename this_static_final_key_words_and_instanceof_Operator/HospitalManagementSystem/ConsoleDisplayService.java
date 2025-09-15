package this_static_final_key_words_and_instanceof_Operator.HospitalManagementSystem;

class ConsoleDisplayService {
    public void displayTotalPatients() {
        System.out.println("Total Patients Admitted: " + HospitalService.getTotalPatients());
    }

    public void displayPatientDetails(Object patientObject) {
        if (patientObject instanceof Patient) {
            Patient patient = (Patient) patientObject;
            System.out.println("Hospital Name: " + HospitalService.getHospitalName());
            System.out.println("Patient ID: " + patient.getPatientID());
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Ailment: " + patient.getAilment());
        } else {
            System.out.println("The object is not an instance of the Patient class.");
        }
    }
}
