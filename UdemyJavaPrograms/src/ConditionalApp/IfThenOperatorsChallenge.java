package ConditionalApp;

public class IfThenOperatorsChallenge {
    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;

        double totalSum = (firstDouble + secondDouble) * 100.00d;
        System.out.println("My Total Sum is : " + totalSum);
        double remainder = totalSum % 40.00d;
        System.out.println("My Remainder is : " + remainder);

        boolean hasNoRemainder = (remainder == 0) ? true: false;
        System.out.println("hasNoRemainder : " + hasNoRemainder);
        if(!hasNoRemainder){
            System.out.println("Got Some Remainder");
        }

    }
}
