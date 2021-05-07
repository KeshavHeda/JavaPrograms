package ValueRefApp;

import java.util.Arrays;

public class ValueRefIntroduction {

    public static void main(String[] args) {

        int firstIntValue = 10;
        int secondIntValue = firstIntValue;

        System.out.println("firstIntValue = " + firstIntValue);
        System.out.println("secondIntValue = " + secondIntValue);

        secondIntValue++;

        System.out.println("after change firstIntValue = " + firstIntValue);
        System.out.println("after change secondIntValue = " + secondIntValue);

        int[] firstIntArray = {1, 2, 3, 4, 5};
        int[] secondIntArray = firstIntArray;

        System.out.println("firstIntArray = " + Arrays.toString(firstIntArray));
        System.out.println("secondIntArray = " + Arrays.toString(secondIntArray));

        secondIntArray[0] = 10;

        System.out.println("after change firstIntArray = " + Arrays.toString(firstIntArray));
        System.out.println("after change secondIntArray = " + Arrays.toString(secondIntArray));

        secondIntArray = new int[]{5, 5, 5, 5, 5, 5, 5, 5};
        modifyArray(firstIntArray);

        System.out.println("after modify firstIntArray = " + Arrays.toString(firstIntArray));
        System.out.println("after modify secondIntArray = " + Arrays.toString(secondIntArray));
    }

    public static void modifyArray(int[] array) {
        array[0] = array[0] * 100;
        array = new int[]{0, 0, 0};
        System.out.println("within method = " + Arrays.toString(array));
    }
}
