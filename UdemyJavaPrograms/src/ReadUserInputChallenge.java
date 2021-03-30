import java.util.Scanner;

public class ReadUserInputChallenge {

    public static void main(String[] args) {
        int counter = 1;
        int totalSum = 0;

        Scanner scanner = new Scanner(System.in);

//        while (true) {
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int userInteger = scanner.nextInt();
                totalSum = totalSum + userInteger;
                counter++;
//                if(counter == 11) {
//                    break;
//                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle end of line
        }

        scanner.close();
        System.out.println("The sum of 10 numbers is : " + totalSum);
    }
}
