public class ChallengePoint {

    private int x;
    private int y;

    public ChallengePoint() {
        this(0,0);
    }

    public ChallengePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(ChallengePoint otherPoint) {
        return distance(otherPoint.getX(),otherPoint.getY());
    }

    public double distance (int xB, int yB) {
        int xA = this.getX();
        int yA = this.getY();

        double xSquare = ((xB - xA) * (xB - xA));
        double ySquare = ((yB - yA) * (yB - yA));
        double sumSquare = xSquare + ySquare;

        double distance = Math.sqrt(sumSquare);
        return distance;
    }

}
