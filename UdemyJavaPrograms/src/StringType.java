public class StringType {

    public static void main(String[] args) {
        // byte short int long
        // float double
        // char boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00AE 2021";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int intValue = 50;
        lastString = lastString + intValue;
        System.out.println("The LastString Int is equal to " + lastString);

        double doubleValue = 120.47d;
        lastString = lastString + doubleValue;
        System.out.println("The LastString Double is equal to " + lastString);
    }
}
