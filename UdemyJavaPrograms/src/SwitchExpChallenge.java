public class SwitchExpChallenge {
    public static void main(String[] args) {
        char charValue = 'B';
        switch (charValue) {
            case 'A':
                System.out.println("Value " + charValue + " was found");
                break;
            case 'B':
                System.out.println("Value " + charValue + " was found");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value " + charValue + " was found");
                break;
            default:
                System.out.println("No valid Value was found");
                break;
        }

        String switchString = "JANUary";
        switch (switchString.toLowerCase()) { // or uppercase check
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not valid month");
                break;
        }
    }
}
