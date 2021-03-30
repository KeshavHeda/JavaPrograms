public class ChallengeCylinder extends ChallengeCircle{

    private double height;

    public ChallengeCylinder(double radius, double height) {
        super(radius);
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
