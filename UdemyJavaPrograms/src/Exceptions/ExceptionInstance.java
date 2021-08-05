package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionInstance {

    public static void main(String[] args) {

        // Check function division exception
//        int x = 40;
//        int y = 0;
//        System.out.println(divideLBYL(x , y));
//        System.out.println(divideEAFP(x , y));
//        System.out.println(divide(x , y));

        // check input exception
//        int x = getUserInput();
//        int x = getUserInputLBYL();
        int x = getUserInputEAFP();
        System.out.println("x is " + x);
    }

    private static int getUserInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter an Integer: ");
        return s.nextInt();
    }

    // Look Before You Leap
    private static int getUserInputLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please Enter an Integer: ");
        String input = s.next();

        for(int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }

        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    // Easy to Ask for Forgiveness/Permission
    private static int getUserInputEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter an Integer: ");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    // Look Before You Leap
    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    // Easy to Ask for Forgiveness/Permission
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }


}
