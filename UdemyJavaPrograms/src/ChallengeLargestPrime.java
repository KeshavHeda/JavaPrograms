public class ChallengeLargestPrime {

    public static int getLargestPrime(int number) {
        int largestPrime = -1;

        if (number > 1) {
            int i;
            for (i = 2; i <= number; i++) {
                if((number % i) == 0)
                {
                    number = number / i;
                    i--;
                }
            }
            largestPrime = i;
        }
        return largestPrime;
    }
}
