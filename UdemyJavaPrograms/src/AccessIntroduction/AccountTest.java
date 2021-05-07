package AccessIntroduction;

public class AccountTest {

    public static void main(String[] args) {
        Account custAccount = new Account("SavingsAccount1");
        custAccount.deposit(1000);
        custAccount.withdrawal(500);
        custAccount.deposit(-20);
        custAccount.withdrawal(-200);
        System.out.println("Balance on account is " + custAccount.getBalance());
        custAccount.calculateBalance();
        System.out.println("******************** Fraud Activities ********************");
        custAccount.balance = 5000; // set balance directly
        custAccount.transactions.add(4500); // add transactions from outside
        custAccount.calculateBalance();
        System.out.println("Balance on account is " + custAccount.getBalance());
    }

}
