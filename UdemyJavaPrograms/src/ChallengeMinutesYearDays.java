public class ChallengeMinutesYearDays {
    public static final String INVALID_VALUE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }

        int hours = (int) (minutes / 60);
        int days = hours / 24;
        int years = days / 365;
        int remainingDays = days % 365;

        String minutesString = minutes + " min";
        String yearString = years + " y";
        String dayString = remainingDays + " d";

        System.out.println(minutes + " min" + " = " + years + " y and " + remainingDays + " d");
    }
}
