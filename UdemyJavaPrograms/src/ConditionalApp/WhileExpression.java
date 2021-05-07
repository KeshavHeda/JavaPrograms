package ConditionalApp;

public class WhileExpression {

    public static void main(String[] args) {
        int count = 1;
        while (count !=6) {
            System.out.println("Count value in while is " + count);
            count++;
        }

        for(count = 1; count != 6; count++) {
            System.out.println("Count value in for is " + count);
        }

        count = 5;
        do{
            System.out.println("Count value in do while is " + count);
            count++;
        } while (count != 6);

    }

}
