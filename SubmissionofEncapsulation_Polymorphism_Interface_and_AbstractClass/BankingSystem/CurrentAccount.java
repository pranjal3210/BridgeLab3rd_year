package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.BankingSystem;

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 500;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        // No interest on current accounts
        return 0;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Withdrawal failed. Overdraft limit exceeded.");
        }
    }
}
