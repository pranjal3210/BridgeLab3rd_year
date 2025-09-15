package this_static_final_key_words_and_instanceof_Operator.BankAccountManagementSystem;

class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // final variable assigned only once
        this.balance = balance;
    }


    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
