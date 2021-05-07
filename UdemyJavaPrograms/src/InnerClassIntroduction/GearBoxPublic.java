package InnerClassIntroduction;

import java.util.ArrayList;
import java.util.List;

public class GearBoxPublic {

    private List<Gear> gears;
    private int maxGears;
    private int currentGear;

    public GearBoxPublic(int maxGears) {
        this.maxGears = maxGears;
        this.currentGear = 0;

        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}