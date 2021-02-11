import java.awt.*;

public class Car {

    // Data Types:
    // int -> integer 1, 2, 3
    // double -> decimal 34.5, 32.1
    // String -> "a1a2", "NewBoy@" (immutable byte[] collection)
    // Color -> from awt library
    // boolean -> true, false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightWorking;

    // Constructor
    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTailLightWorking)
    {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailLightWorking = inputAreTailLightWorking;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    public void speedingUp(double currentSpeed)
    {
        currentSpeed += 100;
    }

    public double speedingUpReally(double currentSpeed)
    {
        currentSpeed += 100;
        return  currentSpeed;
    }
}
