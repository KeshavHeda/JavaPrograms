package BankApp;

public class BankAccountChallenge {

    private String customerName;
    private String email;
    private String phoneNumber;

    private String number;
    private double balance;

    public BankAccountChallenge() {
        this("Default Name", "default email", "default phone", "56789", 2.50);
        System.out.println("Empty Constructor called");
    }

    public BankAccountChallenge(String customerName, String email, String phoneNumber) {
        this(customerName, email, phoneNumber, "99999", 100.50);
    }

    public BankAccountChallenge(String customerName, String email, String phoneNumber, String number, double balance) {
        System.out.println("Constructor with parameters called");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.number = number;
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.number;
    }

    public void setAccountNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositAmount(double amount) {
        this.balance += amount;
        System.out.println("Amount " + amount + " deposited in " + this.getAccountNumber() + " , Total Balance is : " + this.getBalance());
    }

    public void withdrawAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawal from " + this.getAccountNumber() + " , Total Balance is : " + this.getBalance());
        } else {
            System.out.println("Insufficient balance");
        }
    }

}
