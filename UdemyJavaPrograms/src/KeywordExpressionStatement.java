public class KeywordExpressionStatement {
    public static void main(String[] args) {

        // There are 53 keywords in Java like int, double, float, boolean, class, package, public, static
        // we cannot create variable with reserved keywords like int int = 10;

        // Expressions are typed in comments for each line
        int score = 100; // score = 100
        if(score > 99) { // score > 99
            System.out.println("You got the high score!"); // "You got the high score!"
            score = 0; // score = 0
        }

        // Statements are below lines till semi-colon
        int myVariable=50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        // the below two lines are equivalent
        System.out.println("This is " +
                "another " +
                "still more " +
                "multiple lines");
        System.out.println("This is " + "another " + "still more " + "same line");

        // we can have multiple statements in one line
        int anotherVariable = 50;anotherVariable--;System.out.println("This is another one");

        // indentation is putting 4 spaces for each code-block
        if(myVariable == 50){
            System.out.println("Indentation Printed");
        }

    }
}
