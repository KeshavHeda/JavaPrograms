public class IntByteShortLongChallenge {

    public static void main(String[] args)
    {
        byte myByteVar = 10; // Byte.MAX_VALUE; // 127;
        short myShortVar = 20; // Short.MAX_VALUE; // 32767;
        int myIntVar = 50; // Integer.MAX_VALUE; // 2_147_483_647;

        long myLongVar = 50000L + (10L * (myByteVar + myShortVar + myIntVar));
        System.out.println("The Long result is : " + myLongVar);

        short myShortTotal = (short) (1000 + (10 * (myByteVar + myShortVar + myIntVar)));
        System.out.println("The Short result is : " + myShortTotal);
    }

}
