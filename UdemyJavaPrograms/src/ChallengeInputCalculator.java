import java.util.Scanner;

public class ChallengeInputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int counter = 0;
        int totalSum = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int currentNumber = scanner.nextInt();
                totalSum = totalSum + currentNumber;
                counter++;
            } else {
                break;
            }
            scanner.nextLine(); // handle next line
        }

        scanner.close();
        double calcAverage = 0.0;
        if(counter > 0) {
            calcAverage = (double) totalSum / counter;
        }
        long average = Math.round(calcAverage);

        System.out.println("SUM = " + totalSum + " AVG = " + average);
    }

}
