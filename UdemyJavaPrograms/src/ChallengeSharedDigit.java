public class ChallengeSharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {
        boolean isShared = false;

        if ((number1 >= 10) && (number1 <= 99)) {
            if ((number2 >= 10) && (number2 <= 99)) {

                while (number1 > 0) {
                    int leastDigitNumber1 = number1 % 10;

                    int leastDigitNumber2 = number2 % 10;
                    int highestDigitNumber2 = number2 / 10;

                    if ((leastDigitNumber1 == leastDigitNumber2) || (leastDigitNumber1 == highestDigitNumber2)) {
                        isShared = true;
                        break; // complete while loop
                    }
                    number1 = number1 / 10;
                }
            }
        }

        return isShared;
    }

}
