import java.util.Scanner;

public class BankAccount {
    private String depositorName;
    private int accountNumber;
    private char accountType;
    private double balance;

    public BankAccount(int accountNumber, String depositorName, char accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.depositorName = depositorName;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
        } else {
            balance += amount;
            System.out.println("Deposit of Rs." + amount + " successful.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (balance - amount < 500) {
            System.out.println("Insufficient balance. Minimum balance should be Rs.500.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account1 = new BankAccount(100, "Raja", 'S', 8000);
        account1.displayBalance();

        BankAccount account2 = new BankAccount(100, "Raja", 'S', 9000);
        account2.displayBalance();

        BankAccount account3 = new BankAccount(101, "Rani", 'S', 12000);
        account3.displayBalance();

        BankAccount account4 = new BankAccount(102, "Ragu", 'W', 8000);
        account4.displayBalance();

        BankAccount account5 = new BankAccount(103, "Ravi", 'C', 10000);
        account5.displayBalance();

        scanner.close();
    }
}
