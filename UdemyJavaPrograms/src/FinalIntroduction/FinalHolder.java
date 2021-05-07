package FinalIntroduction;

public class FinalHolder {

    private static int classCounter = 0;
    private final int instanceNumber;
    private final String name;

    public FinalHolder(String name) {
        this.name = name;
        classCounter++;
        this.instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
