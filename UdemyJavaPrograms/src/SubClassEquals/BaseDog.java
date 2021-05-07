package SubClassEquals;

public class BaseDog {
    private final String name;

    public BaseDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

//        System.out.println("BaseDog Instance are same : " + (obj instanceof BaseDog));
        if (obj instanceof BaseDog) {
            String objName = ((BaseDog) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
