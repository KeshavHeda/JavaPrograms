public class ChallengeEqualityPrinter {
    public static final String INVALID_VALUE = "Invalid Value";

    public static void printEqual(int first, int second, int third) {
        if ((first < 0) || (second < 0) || (third < 0)) {
            System.out.println(INVALID_VALUE);
        } else if ((first == second) && (second == third)) {
            System.out.println("All numbers are equal");
        } else if ((first == second) || (second == third) || (first == third)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
