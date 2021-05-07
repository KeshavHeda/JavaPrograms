package StaticIntroduction;

public class StaticCheck {

    private String name;
    private static int numInstances;

    public StaticCheck(String name) {
        this.name = name;
        numInstances++;
    }

    public String getName() {
        return name;
    }

    public static int getNumInstances() {
        return numInstances;
    }
}
