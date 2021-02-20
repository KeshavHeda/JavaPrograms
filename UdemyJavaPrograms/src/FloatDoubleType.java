public class FloatDoubleType {

    public static void main(String[] args)
    {
        // FLOAT 32 bits (4 bytes)
        float myMinFloatValue = Float.MIN_VALUE; // Wrapper Class
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My Minimum Float Value: " + myMinFloatValue);
        System.out.println("My Maximum Float Value: " + myMaxFloatValue);
        System.out.println("Busted FLOAT Max value: " + (myMaxFloatValue + 1)); // overflow
        System.out.println("Busted FLOAT Min value: " + (myMinFloatValue - 1)); // underflow

        // DOUBLE 64 bits (8 bytes)
        double myMinDoubleValue = Double.MIN_VALUE; // Wrapper Class
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My Minimum Double Value: " + myMinDoubleValue);
        System.out.println("My Maximum Double Value: " + myMaxDoubleValue);
        System.out.println("Busted DOUBLE Max value: " + (myMaxDoubleValue + 1)); // overflow
        System.out.println("Busted DOUBLE Min value: " + (myMinDoubleValue - 1)); // underflow

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue1 = 5d / 3d;
        double myDoubleValue2 = 5.00 / 3.00; // double is default and should be used

        System.out.println("My Int Value : " + myIntValue);
        System.out.println("My Float Value : " + myFloatValue);
        System.out.println("My Double Value 1 : " + myDoubleValue1);
        System.out.println("My Double Value 2 : " + myDoubleValue2);



    }

}
