public class ChallengeCalculator {

    private Floor floor;
    private Carpet carpet;

    public ChallengeCalculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double totalArea =this.floor.getArea();
        double perSquareCost = this.carpet.getCost();
        return (totalArea * perSquareCost);
    }
}
