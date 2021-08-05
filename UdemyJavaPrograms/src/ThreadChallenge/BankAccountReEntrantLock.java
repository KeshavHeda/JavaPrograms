package ThreadChallenge;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountReEntrantLock {

    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccountReEntrantLock(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account Number = " + accountNumber);
    }

//    public void lockDeposit(double amount) {
//        lock.lock();
//        try {
//            balance += amount;
//            System.out.println("Account " + accountNumber + " deposited " + amount + " and Balance is " + balance);
//        }
//        finally {
//            lock.unlock();
//        }
//    }
//
//    public void lockWithdraw(double amount) {
//        lock.lock();
//        try {
//            balance -= amount;
//            System.out.println("Account " + accountNumber + " withdraw " + amount + " and Balance is " + balance);
//        }
//        finally {
//            lock.unlock();
//        }
//    }

    public void deposit(double amount) {
        boolean status = false;
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                    status = true;
                    System.out.println("Account " + accountNumber + " deposited " + amount + " and Balance is " + balance);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("could not get the lock to deposit amount " + amount);
            }
        } catch (InterruptedException iexc) {
            System.out.println("Exception in deposit " + iexc.getMessage());
        }
        System.out.println("Transaction Status = " + status);
    }

    public void withdraw(double amount) {
        boolean status = false;
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                    System.out.println("Account " + accountNumber + " withdraw " + amount + " and Balance is " + balance);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("could not get the lock to withdraw amount " + amount);
            }
        } catch (InterruptedException iexc) {
            System.out.println("Exception in withdraw " + iexc.getMessage());
        }
        System.out.println("Transaction Status = " + status);
    }
}