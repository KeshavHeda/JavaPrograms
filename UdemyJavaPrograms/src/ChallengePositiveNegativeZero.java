public class ChallengePositiveNegativeZero {

    public static void checkNumber(int number) {
        if(number == 0) {
            System.out.println("zero");
        } else if(number < 0) {
            System.out.println("negative");
        } else if(number > 0) {
            System.out.println("positive");
        }
    }
}
