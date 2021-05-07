package CarApplication;

public class ModelCar extends Car {

    private String colour;
    private int roadServiceMonths;

    public ModelCar(String colour, int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.colour = colour;
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = this.getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if ((newVelocity > 0) && (newVelocity <= 10)) {
            changeGear(1);
        } else if ((newVelocity > 10) && (newVelocity <= 20)) {
            changeGear(2);
        } else if ((newVelocity > 20) && (newVelocity <= 30)) {
            changeGear(3);
        } else if ((newVelocity > 30) && (newVelocity <= 40)) {
            changeGear(4);
        } else {
            changeGear(5);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, this.getCurrentDirection());
        }

    }
}
