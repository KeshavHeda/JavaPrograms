public class ChallengeAreaCalculator {

    public static final double INVALID_VALUE = -1.0;
    public static final double PI_VALUE = Math.PI;

    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUE;
        }
        return (radius * radius * PI_VALUE);
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return INVALID_VALUE;
        }
        return (x * y);
    }
}
