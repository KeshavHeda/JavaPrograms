public class IfThenElseCodeBlock {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // always have code block for if condition even for single line
        if(score == 5000) {
            System.out.println("Your Score was 5000");
            System.out.println("This was executed");
        }

        // if and else condition
        if(score < 5000) {
            System.out.println("Your Score was less than 5000");
        } else {
            System.out.println("Got here");
        }

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Very good score");
        }

        if(score >= 5000) {
            System.out.println("Your score was >= to 5000");
        } else if(score < 1000 && score >= 500) {
            System.out.println("Your score was < 1000 but >= to 500");
        } else {
            System.out.println("Your score was < 500");
        }

        score = 800;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000; // missed during duplicating code
            System.out.println("Your final score was : " + finalScore);
        }

        // Challenge

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver){
            int finalScore = newScore + (newLevelCompleted * newBonus);
            finalScore += 1000; // missed during duplicating code
            System.out.println("Your final score with new variable was : " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your second final score was : " + finalScore);
        }

    }
}
