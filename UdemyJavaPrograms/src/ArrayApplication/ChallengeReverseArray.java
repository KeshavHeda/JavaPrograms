package ArrayApplication;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeReverseArray {

    public static void main(String[] args) {
        int userCount = readInteger();
        int[] userArray = readElements(userCount);
        System.out.println("Entered Array : " + Arrays.toString(userArray));
        reverse(userArray);
        System.out.println("Reversed Array : " + Arrays.toString(userArray));
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

    private static void reverse(int[] userValues) {

        int maxIndex = userValues.length - 1;
        int halfLength = userValues.length / 2;
        for(int k = 0; k < halfLength ; k++) {
            int kTemp = userValues[k];
            userValues[k] = userValues[maxIndex - k];
            userValues[maxIndex - k] = kTemp;
        }

//        int i = 0;
//        int j = userValues.length - 1;
//
//        for(; i < j; i++, j--)
//        {
//            int temp = userValues[i];
//            userValues[i] = userValues[j];
//            userValues[j] = temp;
//        }
    }

}


