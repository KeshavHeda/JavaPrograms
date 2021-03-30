public class VehicleChallengeTest {

    public static void main(String[] args) {

        CarInstance outlander = new CarInstance("red",48);
        outlander.steer(20);
        System.out.println("*******************");
        outlander.accelerate(30);
        System.out.println("*******************");
        outlander.accelerate(20);
        System.out.println("*******************");
        outlander.accelerate(-25);

    }
}
