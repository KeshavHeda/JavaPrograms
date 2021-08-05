package ThreadChallenge;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountTransfer {

    private double balance;
    private String accountNumber;
    private Lock lock = new ReentrantLock();

    BankAccountTransfer(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (lock.tryLock()) {
            try {
                try {
                    // Simulate database access
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                }
                balance -= amount;
                System.out.printf("%s -> %s: Withdrew %f\n", accountNumber, Thread.currentThread().getName(), amount);
                return true;
            } finally {
                lock.unlock();
            }
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (lock.tryLock()) {
            try {
                try {
                    // Simulate database access
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                }
                balance += amount;
                System.out.printf("%s -> %s: Deposited %f\n", accountNumber, Thread.currentThread().getName(), amount);
                return true;
            } finally {
                lock.unlock();
            }
        }
        return false;
    }

    public boolean transfer(BankAccountTransfer destinationAccount, double amount) {
        if (withdraw(amount)) {
            try {
                // Simulate wait before starting deposit process
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
            }
            if (destinationAccount.deposit(amount)) {
                return true;
            }
            else {
                boolean refunded = false;
                while (!refunded) {
                    if(deposit(amount)) {
                        // The deposit failed. Refund the money back into the account.
                        System.out.printf("%s: Destination account busy. Refunding money\n",
                                Thread.currentThread().getName());
                        refunded = true;
                    }
                }
            }
        }

        return false;
    }

}