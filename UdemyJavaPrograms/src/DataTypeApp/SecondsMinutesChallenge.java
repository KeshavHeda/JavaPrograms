package DataTypeApp;

public class SecondsMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        String durationPassed = getDurationString(3660);
        System.out.println(durationPassed);

        durationPassed = getDurationString(65, 45);
        System.out.println(durationPassed);

        durationPassed = getDurationString(3945);
        System.out.println(durationPassed);

        durationPassed = getDurationString(-40);
        System.out.println(durationPassed);

        durationPassed = getDurationString(65, 9);
        System.out.println(durationPassed);
    }

    public static String getDurationString(int minutes, int seconds) {
        String duration = INVALID_VALUE_MESSAGE;
        if (minutes >= 0) {
            if ((seconds >= 0) && (seconds <= 59)) {
                int hours = (minutes / 60);
                int remainingMinutes = (minutes % 60);

                String hourString = hours + "h";
                if(hours < 10) {
                    hourString = "0" + hourString;
                }

                String minuteString = remainingMinutes + "m";
                if(remainingMinutes < 10) {
                    minuteString = "0" + minuteString;
                }

                String secondsString = seconds + "s";
                if(seconds < 10) {
                    secondsString = "0" + secondsString;
                }

                duration = hourString + " " + minuteString + " " + secondsString;
            }
        }
        return duration;
    }

    public static String getDurationString(int seconds) {
        String duration = INVALID_VALUE_MESSAGE;
        if (seconds >= 0) {
            int minutes = (seconds / 60);
            int remainingSeconds = (seconds % 60);
            duration = getDurationString(minutes, remainingSeconds);
        }
        return duration;
    }
}
