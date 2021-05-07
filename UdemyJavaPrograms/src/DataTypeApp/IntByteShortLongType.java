package DataTypeApp;

public class IntByteShortLongType {

    public static void main(String[] args)
    {
        int myValue = 1000;
        // INTEGER
        int myMinIntValue = Integer.MIN_VALUE; // Wrapper Class
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("My Minimum Integer Value: " + myMinIntValue);
        System.out.println("My Maximum Integer Value: " + myMaxIntValue);
        System.out.println("Busted INTEGER Max value: " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted INTEGER Min value: " + (myMinIntValue - 1)); // underflow

        // int has a width of 32 bits
        int intMinValue = -2_147_483_648;
        int intMaxValue = 2_147_483_647;
        int intTotal = (intMinValue / 2);
        System.out.println("Int Total : " + intTotal);

        // BYTE
        byte myMinByteValue = Byte.MIN_VALUE; // Wrapper Class
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Minimum Byte Value: " + myMinByteValue);
        System.out.println("My Maximum Byte Value: " + myMaxByteValue);
        System.out.println("Busted BYTE Max value: " + (myMaxByteValue + 1)); // casted to Integer
        System.out.println("Busted BYTE Min value: " + (myMinByteValue - 1)); // casted to Integer

        // byte has a width of 8 bits
        byte byteMinValue = -128;
        byte byteMaxValue = 127;
        byte byteTotal = (byte) (byteMinValue / 2);
        System.out.println("Byte Total : " + byteTotal);

        // SHORT
        short myMinShortValue = Short.MIN_VALUE; // Wrapper Class
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Minimum Short Value: " + myMinShortValue);
        System.out.println("My Maximum Short Value: " + myMaxShortValue);
        System.out.println("Busted SHORT Max value: " + (myMaxShortValue + 1)); // casted to Integer
        System.out.println("Busted SHORT Min value: " + (myMinShortValue - 1)); // casted to Integer

        // short has a width of 16 bits
        short shortMinValue = -32768;
        short shortMaxValue = 32767;
        short shortTotal = (short) (shortMinValue / 2);
        System.out.println("Short Total : " + shortTotal);

        // LONG
        long myMinLongValue = Long.MIN_VALUE; // Wrapper Class
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Minimum Long Value: " + myMinLongValue);
        System.out.println("My Maximum Long Value: " + myMaxLongValue);
        System.out.println("Busted LONG Max value: " + (myMaxLongValue + 1)); // overflow
        System.out.println("Busted LONG Min value: " + (myMinLongValue - 1)); // underflow

        // long has a width of 64 bits, number ends with l,L
        long longMinValue = -9_223_372_036_854_775_808L;
        long longMaxValue = 9_223_372_036_854_775_807L;
        long longTotal1 = (longMinValue / 2); // integer no casting required
        long longTotal2 = (longMinValue / 3); // double casting required
        System.out.println("Long Total 1 : " + longTotal1);
        System.out.println("Long Total 2 : " + longTotal2);

    }

}
