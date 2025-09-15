package this_static_final_key_words_and_instanceof_Operator.UniversityStudentManagement;

class UniversityService {
    private static String universityName;
    private static int totalStudents = 0;

    public static void setUniversityName(String name) {
        universityName = name;
    }

    public static String getUniversityName() {
        return universityName;
    }

    public static void incrementTotalStudents() {
        totalStudents++;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
