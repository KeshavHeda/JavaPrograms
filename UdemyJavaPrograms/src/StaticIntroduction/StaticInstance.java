package StaticIntroduction;

public class StaticInstance {

    public static int multiplier = 7;

    public static void main(String[] args) {
        StaticCheck firstInstance = new StaticCheck("InstanceOne");
        System.out.println(firstInstance.getName() + " is instance number " + StaticCheck.getNumInstances());

        StaticCheck secondInstance = new StaticCheck("InstanceTwo");
        System.out.println(secondInstance.getName() + " is instance number " + StaticCheck.getNumInstances());

        StaticCheck thirdInstance = new StaticCheck("InstanceThree");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticCheck.getNumInstances());

        // java StaticIntroduction.Main (class with static method) entry point for java executable

        int answer = multiply(6);
        System.out.println("The product is " + answer);
        System.out.println("the multiplier is " + multiplier);

        System.out.println("*************************************");
        System.out.println("Main method called");
        StaticInitBlock initBlock = new StaticInitBlock();
        initBlock.printMessage();
        System.out.println("owner is " + StaticInitBlock.owner);
    }

    public static int multiply(int number) {
        return multiplier * number;
    }

}
