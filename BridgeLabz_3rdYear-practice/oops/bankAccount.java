class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance = " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance = " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display account details
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}


public class bankAccount {
    public static void main(String[] args) {
        // Create two accounts
        BankAccount acc1 = new BankAccount(1001, "John", 5000);
        BankAccount acc2 = new BankAccount(1002, "Alice", 8000);

        System.out.println("Initial Account Details:");
        acc1.display();
        acc2.display();

        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc2.deposit(1000);
        acc2.withdraw(9000); 
        System.out.println("Final Account Details:");
        acc1.display();
        acc2.display();
    }
}
