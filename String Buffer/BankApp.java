// Abstract class representing a Bank Account
abstract class BankAccount {
    String name;
    String accountNumber;
    String address;
    double balance;

    // Constructor
    public BankAccount(String name, String accountNumber, String address, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.balance = balance;
    }

    // Abstract methods
    abstract void withdraw(double amount);
    abstract void deposit(double amount);

    // Method to display balance
    public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: $" + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate; // Annual interest rate in percentage

    // Constructor
    public SavingsAccount(String name, String accountNumber, String address, double balance, double interestRate) {
        super(name, accountNumber, address, balance);
        this.interestRate = interestRate;
    }

    // Implementing withdraw method
    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Amount withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance! Withdrawal failed.");
        }
    }

    // Implementing deposit method
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Amount deposited: $" + amount);
    }

    // Method to calculate amount after 1 year with interest
    public void calcAmt() {
        double amountAfterOneYear = balance + (balance * interestRate / 100);
        System.out.println("Amount after 1 year with interest: $" + amountAfterOneYear);
    }
}

// Main class to demonstrate functionality
public class BankApp {
    public static void main(String[] args) {
        // Create an instance of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("John Doe", "123456789", "123 Elm Street", 1000.0, 5.0);

        // Display initial details
        savingsAccount.display();

        // Perform deposit
        savingsAccount.deposit(500);

        // Perform withdrawal
        savingsAccount.withdraw(300);

        // Display balance and calculate amount after 1 year
        savingsAccount.display();
        savingsAccount.calcAmt();
    }
}
