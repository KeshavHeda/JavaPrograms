public class ChallengeDecimalCompare {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        int firstNumber = (int) (number1 * 1000);
        int secondNumber = (int) (number2 * 1000);
        return (firstNumber == secondNumber);
    }
}
