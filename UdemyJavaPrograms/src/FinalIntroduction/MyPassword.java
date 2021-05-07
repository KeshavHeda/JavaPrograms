package FinalIntroduction;

public class MyPassword {
    private static final int key = 748576362;
    private final int encryptedPassword;

    public MyPassword(int userPassword) {
        this.encryptedPassword = encryptDecrypt(userPassword);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving Password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome User");
            return true;
        } else {
            System.out.println("No, you cannot come in");
            return false;
        }
    }

}
