public class ChallengeSpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609d);
    }

    public static void printConversion(double kilometersPerHour) {
        long convertedMilesPerHour = toMilesPerHour(kilometersPerHour);

        if(convertedMilesPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + convertedMilesPerHour + " mi/h");
        }
    }
}
