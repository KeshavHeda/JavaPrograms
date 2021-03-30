public class ChallengeFlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        boolean packComplete = false;

        if ((bigCount < 0) || (smallCount < 0) || (goal <= 0)) {
            packComplete = false;
            return packComplete;
        }

        int bigPacksNeeded = goal / 5;
        int remainingGoal = goal % 5;

        if(bigPacksNeeded == 0) {
            packComplete = (smallCount >= goal);
        } else if(bigPacksNeeded < bigCount) {
            packComplete = (smallCount >= remainingGoal);
        } else {
            int bigPacksLeft = bigPacksNeeded - bigCount;
            int bigWeightLeft = bigPacksLeft * 5;
            packComplete = smallCount >= (bigWeightLeft + remainingGoal);
        }

        return packComplete;
    }

}
