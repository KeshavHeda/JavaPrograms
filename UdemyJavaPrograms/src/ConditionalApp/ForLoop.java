package ConditionalApp;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop I " + i + " Hello");
        }

        int x = 0;
        for (; x < 5; x++) {
            System.out.println("Loop X " + x + " Hello");
        }
        System.out.println("PostOuterLoop X " + x + " Hello");

        x = 0;
        for (; x < 5; ++x) {
            System.out.println("Loop X " + x + " Hello");
        }
        System.out.println("PreOuterLoop " + x + " Hello");

        for(int num = 1; num < 7; num += 2) {
            System.out.println("Number is : " + num);
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
