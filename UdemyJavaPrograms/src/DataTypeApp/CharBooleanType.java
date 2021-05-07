package DataTypeApp;

public class CharBooleanType {

    public static void main(String[] args) {
        // width of char is 16 bits (2 bytes)
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("My Normal Character : " + myChar);
        System.out.println("My Unicode Character : " + myUnicodeChar);

        char copyrightChar = '\u00A9';
        char registeredChar = '\u00AE';
        System.out.println("CopyRight Character : " + copyrightChar);
        System.out.println("Registered Character : " + registeredChar);


        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isMale=  true;

    }
}
