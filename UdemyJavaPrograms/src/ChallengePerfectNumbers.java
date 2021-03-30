public class ChallengePerfectNumbers {

    public static boolean isPerfectNumber(int number) {
        boolean isPerfect = false;

        if (number >= 1) {
            int loopStart = 1;
            int divisorsSum = 0;

            while (loopStart < number) {
                if ((number % loopStart) == 0) {
                    divisorsSum = divisorsSum + loopStart;
                }
                loopStart++;
            }

            isPerfect = (divisorsSum == number);
        }
        return isPerfect;
    }

}
