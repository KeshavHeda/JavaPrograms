import java.util.Scanner;

public class MinMaxNumbersChallenge {

    public static void main(String[] args) {
//        int minNumber = -1;
//        int maxNumber = -1;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

//        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int currentNumber = scanner.nextInt();

//                if (flag) {
//                    flag = false;
//                    maxNumber = currentNumber;
//                    minNumber = currentNumber;
//                }

                if (currentNumber < minNumber) {
                    minNumber = currentNumber;
                }
                if (currentNumber > maxNumber) {
                    maxNumber = currentNumber;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle next line
        }

        scanner.close();
        System.out.println("The min No is : " + minNumber);
        System.out.println("The max No is : " + maxNumber);
    }

}
