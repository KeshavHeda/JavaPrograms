public class SwitchExpression {

    public static void main(String[] args) {
        int intValue = 1;
        if(intValue == 1) {
            System.out.println("Value was 1");
        } else if(intValue == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was neither 1 nor 2");
        }

        // missing break will continue processing next case statements
        int switchValue = 4;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Value was above 5");
                break;
        }

        // More code here

    }

}
