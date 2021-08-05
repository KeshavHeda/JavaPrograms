package ThreadChallenge;

public class BankAccountLock {

    private double balance;
    private String accountNumber;
    private Object lock = new Object();

    public BankAccountLock(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account Number = " + accountNumber);
    }

//    public synchronized void deposit(double amount) {
//        balance += amount;
//        System.out.println("Account " + accountNumber + " deposited " + amount + " and Balance is " + balance);
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//        System.out.println("Account " + accountNumber + " withdraw " + amount + " and Balance is " + balance);
//    }

    public void deposit(double amount) {
        synchronized (lock) { // sync on this is also ok
            balance += amount;
            System.out.println("Account " + accountNumber + " deposited " + amount + " and Balance is " + balance);
        }
    }

    public void withdraw(double amount) {
        synchronized (lock) { // sync on this is also ok
            balance -= amount;
            System.out.println("Account " + accountNumber + " withdraw " + amount + " and Balance is " + balance);
        }
    }
}