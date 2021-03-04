public class ChallengeBarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = false;

        if ((hourOfDay >= 0) && (hourOfDay <= 23)) {
            if (barking) {
                if ((hourOfDay > 22) || (hourOfDay < 8)) {
                    wakeUp = true;
                }
            }
        }
        return wakeUp;
    }
}
