public class ChallengeTeenNumberChecker {
    public static boolean hasTeen(int number1, int number2, int number3) {
        boolean isTeen = false;

        if (isTeen(number1) || isTeen(number2) || isTeen(number3)) {
            isTeen = true;
        }

        return isTeen;
    }

    public static boolean isTeen(int checkNumber) {
        return ((checkNumber >= 13) && (checkNumber <= 19));
    }
}
