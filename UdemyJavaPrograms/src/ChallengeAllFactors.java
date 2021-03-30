public class ChallengeAllFactors {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int loopStart = 1;
        while (loopStart <= number) {
            if ((number % loopStart) == 0) {
                System.out.println(loopStart);
            }
            loopStart++;
        }
    }
}
