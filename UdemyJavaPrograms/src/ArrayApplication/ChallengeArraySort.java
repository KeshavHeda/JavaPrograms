package ArrayApplication;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeArraySort {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        System.out.println("The values before sorting : ");
        printArray(myIntegers);

        // sort descending order
        int[] sortValues = sortIntegers(myIntegers);

        System.out.println("The values after sorting : ");
        printArray(sortValues);
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    private static void printArray(int[] userValues)
    {
        for(int i= 0; i< userValues.length; i++)
        {
            System.out.println("Element: " + i + ", Value: " + userValues[i]);
        }
    }

    private static int[] sortIntegers(int[] userValues) {

//        int[] sortedArray = new int[userValues.length];
//        for (int i = 0; i < userValues.length; i++) {
//            sortedArray[i] = userValues[i];
//        }
        int[] sortedArray = Arrays.copyOf(userValues, userValues.length);

        // sort using double for
        int forTemp;
        for (int i = 0; i < sortedArray.length; i++) {
            for(int j = 0; j < i; j++ )
            {
                if(sortedArray[j] < sortedArray[i])
                {
                    forTemp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = forTemp;
                }
            }
        }

//
//        // sort using while and for
//        boolean flag = true;
//        int whileTemp;
//        while (flag)
//        {
//            flag = false;
//
//            for (int i = 0; i < sortedArray.length - 1; i++) {
//                if(sortedArray[i] < sortedArray[i+1])
//                {
//                    whileTemp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = whileTemp;
//                    flag = true;
//                }
//            }
//        }


        return sortedArray;
    }

}



class ChallengeSortedArray {

    private static Scanner scanner;

    public static int[] getIntegers(int number) {
        scanner = new Scanner(System.in);
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] userValues)
    {
        for(int i= 0; i< userValues.length; i++)
        {
            System.out.println("Element " + i + " contents " + userValues[i]);
        }
    }

    public static int[] sortIntegers(int[] userValues) {

        int[] sortedArray = Arrays.copyOf(userValues, userValues.length);


        boolean flag = true;
        int whileTemp;
        while (flag)
        {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1])
                {
                    whileTemp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = whileTemp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

}
