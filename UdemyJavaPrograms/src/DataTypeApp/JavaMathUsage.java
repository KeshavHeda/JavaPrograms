package DataTypeApp;

public class JavaMathUsage {
    public static void main(String[] args) {
        double number = 1.5;
        long rounded = Math.round(number);
        System.out.println("with 1.5= " + rounded);
        System.out.println("with 3.9= " + Math.round(3.9));
        System.out.println("with 4.5= " + Math.round(4.5));

        int sum = 45;
        int count = 10;
// typecasting so result is double e.g. double / int -> double
        double average = (double) sum / count;
        long roundedAverage = Math.round(average);
        System.out.println("average= " + average);
        System.out.println("roundedAverage= " + roundedAverage);
    }
}
