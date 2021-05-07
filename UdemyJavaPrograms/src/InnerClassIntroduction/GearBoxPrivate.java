package InnerClassIntroduction;

import java.util.ArrayList;
import java.util.List;

public class GearBoxPrivate {

    private List<Gear> gears;
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;

    public GearBoxPrivate(int maxGears) {
        this.maxGears = maxGears;
        this.currentGear = 0;

        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i = 1; i <= maxGears; i++)
        {
            this.gears.add(new Gear(i, i * 5.3));
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

//    public void addGear(int gearNo, double ratio) {
//        if ((gearNo > 0) && (gearNo <= maxGears)) {
//            this.gears.add(new Gear(gearNo, ratio));
//        }
//    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            this.currentGear = 0;
            System.out.println("Grind!!!");
        }
    }

    public double wheelSpeed (int revs)
    {
        if(clutchIsIn)
        {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}

