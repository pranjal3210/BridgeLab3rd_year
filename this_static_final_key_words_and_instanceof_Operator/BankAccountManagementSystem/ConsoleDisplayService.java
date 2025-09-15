package this_static_final_key_words_and_instanceof_Operator.BankAccountManagementSystem;

class ConsoleDisplayService {
    public void displayAccountDetails(Object accountObject) {
        if (accountObject instanceof BankAccount) {
            BankAccount account = (BankAccount) accountObject;
            System.out.println("Bank Name: " + BankService.getBankName());
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid account instance.");
        }
    }
}
