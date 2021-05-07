package FinalIntroduction;

public class ExtendedPassword extends MyPassword {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

}
