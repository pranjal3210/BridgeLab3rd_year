package this_static_final_key_words_and_instanceof_Operator.EmployeeManagementSystem;

class CompanyService {
    private static String companyName;
    private static int totalEmployees = 0;

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void incrementEmployeeCount() {
        totalEmployees++;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }
}
