package SubClassEquals;

public class EqualsTest {

    public static void main(String[] args) {
        Labrador rover = new Labrador("rover");
        BaseDog baseRover = new BaseDog("rover");

        System.out.println("Labrador and BaseDog : " + rover.equals(baseRover));
        System.out.println("BaseDog and Labrador : " + baseRover.equals(rover));
    }
}
