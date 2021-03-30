public class WhileExpChallenge {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {
            number++;
            if (isEvenNumber(number)) {
                count++;
                System.out.println("Even Number : " + number);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Total Even Numbers were : " + count);
    }

    public static boolean isEvenNumber(int number) {
        boolean isEven = false;
        if ((number % 2) == 0) {
            isEven = true;
        }
        return isEven;
    }
}
