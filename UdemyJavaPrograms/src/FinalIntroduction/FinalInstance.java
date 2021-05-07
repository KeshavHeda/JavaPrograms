package FinalIntroduction;

public class FinalInstance {

    public static void main(String[] args) {

        FinalHolder firstInstance = new FinalHolder("InstanceOne");
        FinalHolder secondInstance = new FinalHolder("InstanceTwo");
        FinalHolder thirdInstance = new FinalHolder("InstanceThree");

        System.out.println(firstInstance.getInstanceNumber());
        System.out.println(secondInstance.getInstanceNumber());
        System.out.println(thirdInstance.getInstanceNumber());
//        System.out.println(FinalHolder.classCounter);

//        firstInstance.instanceNumber = 4;
        System.out.println(Math.PI);

        int userPassword = 674312;
        MyPassword myPassword = new ExtendedPassword(userPassword);
        myPassword.storePassword();

        myPassword.letMeIn(1);
        myPassword.letMeIn(523266);
        myPassword.letMeIn(9773);
        myPassword.letMeIn(0);
        myPassword.letMeIn(-1);
        myPassword.letMeIn(123);
        myPassword.letMeIn(674312); // correct

    }
}
