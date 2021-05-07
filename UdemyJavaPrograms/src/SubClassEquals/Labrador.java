package SubClassEquals;

public class Labrador extends BaseDog {

    public Labrador(String name) {
        super(name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//
//        System.out.println("Labrador Instance are same : " + (obj instanceof Labrador));
//        if (obj instanceof Labrador) {
//            String objName = ((Labrador) obj).getName();
//            return this.getName().equals(objName);
//        }
//        return false;
//    }
}
