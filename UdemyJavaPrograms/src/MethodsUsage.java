public class MethodsUsage {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // int finalScore = calculateScore(true, 800, 5, 100); // pass values directly to function
        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus); // pass values through variables
        System.out.println("Your first final score was : " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your second final score was : " + finalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1; // invalid result
    }
}
