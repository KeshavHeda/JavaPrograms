public class MethodsUsageChallenge {

    public static void main(String[] args) {
        String playerName = "Tim";
        int score = 1500;

        int playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, playerPosition);

        playerName = "Bob";
        score = 900;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, playerPosition);

        playerName = "Percy";
        score = 400;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, playerPosition);

        playerName = "Gilbert";
        score = 50;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, playerPosition);

        playerName = "Louise";
        score = 1000;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, playerPosition);

        playerName = "Carol";
        score = 500;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, playerPosition);

        playerName = "Frank";
        score = 100;
        playerPosition = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, playerPosition);
    }

    // method with no return type to display position
    public static void displayHighScorePosition(String playerName, int highScorePosition)
    {
        System.out.println("The " + playerName + " managed to get into position " +
                highScorePosition + " on the high score table");
    }

    // method with return type to calculate position
    public static int calculateHighScorePosition(int playerScore)
    {
        int position = 4; // remove multiple return statements by using return variable
        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500){  // unnecessary check of 1000
            position = 2;
        } else if(playerScore >= 100) {  // unnecessary check of 500
            position = 3;
        }
        return position;

//        if(playerScore >= 1000) {
//            return 1;
//        } else if((playerScore >= 500) && (playerScore < 1000)){  // unnecessary check of 1000
//            return 2;
//        } else if((playerScore >= 100) && (playerScore < 500)) {  // unnecessary check of 500
//            return 3;
//        }
//        return 4;
    }
}
