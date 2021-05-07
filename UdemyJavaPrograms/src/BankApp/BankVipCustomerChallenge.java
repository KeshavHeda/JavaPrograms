package BankApp;

public class BankVipCustomerChallenge {

    private String name;
    private String emailAddress;
    private double creditLimit;

    public BankVipCustomerChallenge() {
        this("Default Name","Default EmailAddress", 20.00);
    }

    public BankVipCustomerChallenge(String name, String emailAddress) {
        this(name, emailAddress, 30.0);
    }

    public BankVipCustomerChallenge(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return this.name;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

}
