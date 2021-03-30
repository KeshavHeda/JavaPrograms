public class ChallengeSumEvenDigit {

    public static int getEvenDigitSum(int number) {
        int sumEvenDigits = -1;

        if (number >= 0) {

            sumEvenDigits = 0;
            while (number > 0) {
                int currentDigit = number % 10; // get least significant digit
                if ((currentDigit % 2) == 0) {
                    sumEvenDigits += currentDigit;
                }
                number = number / 10; // drop least significant digit
            }
        }

        return sumEvenDigits;
    }

}
