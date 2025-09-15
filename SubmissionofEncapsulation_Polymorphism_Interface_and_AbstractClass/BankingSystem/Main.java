package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.BankingSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("SA123", "Charlie", 2500),
                new CurrentAccount("CA456", "David", 1200)
        };

        for (BankAccount acc : accounts) {
            System.out.println("-------------------------");
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Initial Balance: $" + acc.getBalance());
            acc.deposit(500);
            acc.withdraw(800);
            System.out.println("Final Balance: $" + acc.getBalance());
            System.out.println("Annual Interest: $" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                System.out.println("Loan Status: " + ((Loanable) acc).calculateLoanEligibility());
            }
        }
    }
}
