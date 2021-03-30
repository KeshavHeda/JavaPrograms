public class ChallengeLastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        boolean sameDigits = false;
        if (isValid(number1)) {
            if (isValid(number2)) {
                if (isValid(number3)) {
                    int leastDigit1 = number1 % 10;
                    int leastDigit2 = number2 % 10;
                    int leastDigit3 = number3 % 10;

                    if ((leastDigit1 == leastDigit2) || (leastDigit1 == leastDigit3) || (leastDigit2 == leastDigit3)) {
                        sameDigits = true;
                    }
                }
            }
        }
        return sameDigits;
    }

    public static boolean isValid(int number) {
        boolean result = false;
        if(number >= 10 && number <= 1000) {
            result = true;
        }
        return result;
    }

}
