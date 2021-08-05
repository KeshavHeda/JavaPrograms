package LambdaChallenge;

import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaInstance {

    public static void main(String[] args) {

        // anonymous type
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for(String part: parts) {
                    System.out.println(part);
                }
            }
        };

        System.out.println("************** Challenge 1 *********************");

        new Thread(runnable).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException iexc) {
            iexc.printStackTrace();
        }

        System.out.println("***********************************");

        // lambda type
        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for(String part: parts) {
                System.out.println(part);
            }
        };

        new Thread(runnable1).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException iexc) {
            iexc.printStackTrace();
        }

        System.out.println("************** Challenge 2 *********************");
        System.out.println(everySecondChar("Welcome"));
        System.out.println(everySecondChar("1234567890"));

        System.out.println("************** Challenge 6 *********************");
        Supplier<String> iLoveJava = () -> {
            return "I love Java!";
        };

        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

    }

    public static String everySecondChar(String source) {
//        StringBuilder returnVal = new StringBuilder();
//        for(int i = 0; i < source.length(); i++) {
//            if(i % 2 == 1) {
//                returnVal.append(source.charAt(i));
//            }
//        }
//
//        return returnVal.toString();

        Function<String, String> lambdaFunction = (String s) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                if(i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }

            return returnVal.toString();
        };

        return everySecondCharFunc(lambdaFunction,source);
    }

    public static String everySecondCharFunc(Function<String, String> func, String source) {
        return func.apply(source);
    }

}
