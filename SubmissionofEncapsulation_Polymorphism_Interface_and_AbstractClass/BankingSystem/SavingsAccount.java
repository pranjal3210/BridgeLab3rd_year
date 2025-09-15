package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.BankingSystem;

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4%

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for $" + amount + " submitted for account " + getAccountNumber());
    }

    @Override
    public String calculateLoanEligibility() {
        if (getBalance() > 1000) {
            return "Eligible for a loan up to $" + (getBalance() * 2);
        }
        return "Not eligible for a loan.";
    }
}
