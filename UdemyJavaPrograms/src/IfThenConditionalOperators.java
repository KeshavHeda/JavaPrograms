public class IfThenConditionalOperators {
    public static void main(String[] args) {

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an Alien!"); // single statement for if

        // one or more lines inside code block
        if(isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 95;
        if(topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100) )
            System.out.println("Greater than second top score and less than 100");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("Either or both of the conditions are true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        // use abbreviated condition check to avoid assignment issue
        if(isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true: false;
        if(wasCar)
            System.out.println("wasCar is true");
    }
}
