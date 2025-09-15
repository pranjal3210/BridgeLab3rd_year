package this_static_final_key_words_and_instanceof_Operator.HospitalManagementSystem;

class HospitalService {
    private static String hospitalName;
    private static int totalPatients = 0;

    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    public static String getHospitalName() {
        return hospitalName;
    }

    public static void admitPatient() {
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }
}
