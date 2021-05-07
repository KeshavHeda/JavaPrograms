package CarApplication;

public class VehicleTest {

    public static void main(String[] args) {

        ModelCar outlander = new ModelCar("red",48);
        outlander.steer(20);
        System.out.println("*******************");
        outlander.accelerate(30);
        System.out.println("*******************");
        outlander.accelerate(20);
        System.out.println("*******************");
        outlander.accelerate(-25);

    }
}
