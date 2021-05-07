package ArrayApplication;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeMinElement {

    public static void main(String[] args) {
        int userCount = readInteger();
        int[] userArray = readElements(userCount);
        System.out.println("User Entered values are : " + Arrays.toString(userArray));
        System.out.println("Minimum value : " + findMin(userArray));
    }

    private static int readInteger() {
        System.out.println("Enter count of numbers:");
        Scanner countScanner = new Scanner(System.in);
        int count = countScanner.nextInt();
        countScanner.nextLine();
        return count;
    }


    private static int[] readElements(int count) {
        int[] userValues = new int[count];
        Scanner elementScanner = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number:");
            userValues[i] = elementScanner.nextInt();
            elementScanner.nextLine();
        }
        return userValues;
    }

    private static int findMin(int[] userValues) {
        int minValue = userValues[0];
        for (int i = 0; i < userValues.length; i++) {
            if (minValue > userValues[i]) {
                minValue = userValues[i];
            }
        }
        return minValue;
    }

}