public class ChallengeGreatestDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestDivisor = -1;

        if ((first >= 10) && (second >= 10)) {
            greatestDivisor = 0;

            int loopMax = first;
            if (second < first) {
                loopMax = second;
            }

            int loopStart = 1;
            while (loopStart <= loopMax) {
                if ((first % loopStart) == 0) {
                    if ((second % loopStart) == 0) {
                        greatestDivisor = loopStart;
                    }
                }
                loopStart++;
            }
        }
        return greatestDivisor;

    }

}
