package ConditionalApp;

public class ForLoopInterestRateChallenge {
    public static void main(String[] args) {
        double amount = 10000.0;
        System.out.println("********** Normal Loop Started **********");
        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(amount, i)));
        }

        System.out.println("********** Reverse Loop Started **********");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(amount, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
