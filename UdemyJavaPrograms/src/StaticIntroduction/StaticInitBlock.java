package StaticIntroduction;

public class StaticInitBlock {
    public static final String owner;

    static {
        owner = "Tim";
        System.out.println("1st static initialization block called");
    }

    public StaticInitBlock() {
        System.out.println("StaticInitBlock constructor called");
    }

    static {
        System.out.println("2nd static initialization block called");
    }

    public void printMessage() {
        System.out.println("printMessage method called");
    }

}
