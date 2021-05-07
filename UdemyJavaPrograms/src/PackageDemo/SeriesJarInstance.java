package PackageDemo;

import com.example.mathseries.Series;

public class SeriesJarInstance {

    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("******************************");
        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("******************************");
        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }

//        long result = 0;
//        result = Series.nSum(5);
//        System.out.println("Result of nSum 5 is " + result);
//
//        result = Series.factorial(5);
//        System.out.println("Result of factorial 5 is " + result);
//
//        result = Series.fibonacci(5);
//        System.out.println("Result of fibonacci 5 is " + result);
    }
}
