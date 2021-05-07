package ArrayApplication;

import java.util.Scanner;

public class ArrayIntroduction {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] initIntegers = {1,2,3,4,5}; // initialize values to array

        int[] myIntegers = getIntegers(5);
        System.out.println("The values entered : ");
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));

//        for(int i= 0; i< myIntegers.length; i++)
//        {
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        }

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

    private static double getAverage(int[] userValues)
    {
        double sum = 0;
        for (int i = 0; i < userValues.length; i++) {
            sum += userValues[i];
        }
        return  (double) sum / (double) userValues.length;
    }

    private static void printArray(int[] userValues)
    {
        for(int i= 0; i< userValues.length; i++)
        {
            System.out.println("Element: " + i + ", Value: " + userValues[i]);
        }
    }

}



