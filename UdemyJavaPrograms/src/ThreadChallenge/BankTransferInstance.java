package ThreadChallenge;

public class BankTransferInstance {

    public static void main(String[] args) {
        BankAccountTransfer account1 = new BankAccountTransfer("12345-678", 500.00);
        BankAccountTransfer account2 = new BankAccountTransfer("98765-432", 1000.00);

        new Thread(new BankTransfer(account1, account2, 10.00), "Transfer1").start();
        new Thread(new BankTransfer(account2, account1, 55.88), "Transfer2").start();
    }

}
