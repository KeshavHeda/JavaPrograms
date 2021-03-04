public class ChallengeSumOddRange {

    public static boolean isOdd(int number) {
        boolean isOddNumber = false;
        if (number >= 0) {
            if ((number % 2) != 0) {
                isOddNumber = true;
            }
        }
        return isOddNumber;
    }

    public static int sumOdd(int start, int end) {
        int totalSum = -1;

        if ((start >= 0) && (end >= 0)) {
            if (end >= start) {
                totalSum = 0;
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        totalSum += i;
                    }
                }
            }
        }
        return totalSum;
    }
}
