package ThreadChallenge;

public class BankTransfer implements Runnable {
    private BankAccountTransfer sourceAccount, destinationAccount;
    private double amount;

    BankTransfer(BankAccountTransfer sourceAccount, BankAccountTransfer destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    public void run() {
        while (!sourceAccount.transfer(destinationAccount, amount))
            continue;
        System.out.printf("%s completed\n", Thread.currentThread().getName());
    }
}
