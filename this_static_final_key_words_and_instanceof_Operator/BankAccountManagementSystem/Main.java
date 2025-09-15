package this_static_final_key_words_and_instanceof_Operator.BankAccountManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Services
        AccountService accountService = new AccountService();
        ConsoleDisplayService displayService = new ConsoleDisplayService();

        BankAccount account1 = new BankAccount("Ayush Sharma", "ACC12345", 1000.00);
        BankService.incrementTotalAccounts();
        BankAccount account2 = new BankAccount("Anshitva Mishra", "ACC67890", 500.00);
        BankService.incrementTotalAccounts();

        System.out.println("\nAccount 1 Details:");
        displayService.displayAccountDetails(account1);

        System.out.println("\nAccount 2 Details:");
        displayService.displayAccountDetails(account2);

        System.out.println("\nTotal number of accounts: " + BankService.getTotalAccounts());

        System.out.println("\nPerforming transactions on Account 1:");
        accountService.deposit(account1, 200);
        accountService.withdraw(account1, 150);
        displayService.displayAccountDetails(account1);

        System.out.println("\nPerforming transactions on Account 2:");
        displayService.displayAccountDetails(account2);
        accountService.deposit(account2, 100);
        accountService.withdraw(account2, 800);
    }
}
