package this_static_final_key_words_and_instanceof_Operator.HospitalManagementSystem;

class Patient {
    // Final variable to uniquely identify each patient
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
    }

    // Getters
    public String getPatientID() { return patientID; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAilment() { return ailment; }
}
