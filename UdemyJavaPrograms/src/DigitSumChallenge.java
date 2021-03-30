public class DigitSumChallenge {
    public static void main(String[] args) {
        int sumOfDigits = sumDigits(125 );
        System.out.println("The sum of digits for 125 is : " + sumOfDigits);
        sumOfDigits = sumDigits(-125 );
        System.out.println("The sum of digits for -125 is : " + sumOfDigits);
        sumOfDigits = sumDigits(4 );
        System.out.println("The sum of digits for 4 is : " + sumOfDigits);
        sumOfDigits = sumDigits(32123 );
        System.out.println("The sum of digits for 32123 is : " + sumOfDigits);
    }

    public static int sumDigits(int number) {
        int totalSum = 0;

        if (number < 10) {
            totalSum = -1;
            return totalSum;
        }

        int calculateNumber = number;
        while (calculateNumber > 0) {
            int leastDigit = calculateNumber % 10;
            totalSum += leastDigit;
            calculateNumber = calculateNumber / 10;
        }
        return totalSum;
    }

}
