package this_static_final_key_words_and_instanceof_Operator.BankAccountManagementSystem;

class BankService {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    public static String getBankName() {
        return bankName;
    }

    public static void incrementTotalAccounts() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
