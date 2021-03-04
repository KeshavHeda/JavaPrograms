public class ForLoopSumThreeFiveChallenge {
    public static void main(String[] args) {

        int numbersSum = 0;
        int numberCount = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3) == 0) {
                if ((i % 5) == 0) {
                    System.out.println("Number " + i + " is divisible by 3 and 5");
                    numbersSum += i;
                    numberCount++;
                }
            }

            if (numberCount == 5) {
                break;
            }
        }

        System.out.println("The total sum is : " + numbersSum);
    }
}
