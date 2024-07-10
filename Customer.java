public class Customer {
    private int accountNo;
    private String accName;
    private double balance;

    public Customer(int accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }


    public synchronized void deposit(double amount) {
        System.out.println("Depositing Rs." + amount);
        balance += amount;
        System.out.println("Deposit completed. New balance: Rs." + balance);
        
        notify();
    }

    public synchronized void withdraw(double amount) {
        System.out.println("Withdrawing Rs." + amount);
        while (amount > balance) {
            try {
                System.out.println("Insufficient balance. Waiting for deposit...");
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdraw operation success. New balance: Rs." + balance);
    }

    public static void main(String[] args) {
        
        Customer customer = new Customer(1, "John Doe", 10000);

        performTransaction(customer, 12000);
        performTransaction(customer, 3000);
        
        performTransaction(customer, 11000);
        performTransaction(customer, 4000);
        
        performTransaction(customer, -10000);
        performTransaction(customer, -2000);  
        
        performTransaction(customer, 0);      
        performTransaction(customer, 0);      
        
        performTransaction(customer, 100.67); 
        performTransaction(customer, 200.68); 
    }

    
    private static void performTransaction(Customer customer, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount: " + amount);
            return;
        }

        if (amount <= customer.balance) {
            new Thread(() -> customer.withdraw(amount)).start();
        } else {
            new Thread(() -> customer.deposit(amount)).start();
        }
    }
}
