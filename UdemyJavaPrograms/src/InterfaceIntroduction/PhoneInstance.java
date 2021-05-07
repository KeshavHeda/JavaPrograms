package InterfaceIntroduction;

public class PhoneInstance {
    public static void main(String[] args) {
        ITelephone telephone;
        telephone = new DeskPhone(12341234);
        telephone.powerOn();
        telephone.dial(333333333);
        telephone.callPhone(12341234);
        telephone.answer();

        System.out.println("**************************************************");

        telephone = new MobilePhone(1111111);
        telephone.powerOn();
        telephone.dial(333333333);
        telephone.callPhone(1111111);
        telephone.answer();
    }
}
