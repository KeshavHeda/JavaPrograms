public class ChallengeLeapYear {

    public static boolean isLeapYear(int year) {

        boolean isLeap = false;
        if ((year >= 1) && (year <= 9999)) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    isLeap = true;
                }
            } else if ((year % 4) == 0) {
                isLeap = true;
            }
        }
        return isLeap;
    }
}
