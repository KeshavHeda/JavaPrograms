public class FeetInchesCentimetersChallenge {
    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(157);
        System.out.println("157 inches : " + centimeters + " cm");
        centimeters = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println("6 feet, 0 inches : " + centimeters + " cm");
        centimeters = calcFeetAndInchesToCentimeters(7, 5);
        System.out.println("7 feet, 5 inches : " + centimeters + " cm");
        centimeters = calcFeetAndInchesToCentimeters(0, 1);
        System.out.println("0 feet, 1 inches : " + centimeters + " cm");
        centimeters = calcFeetAndInchesToCentimeters(-10, 1);
        System.out.println("-10 feet, 1 inches : " + centimeters + " cm");
        centimeters = calcFeetAndInchesToCentimeters(6, -10);
        System.out.println("6 feet, -10 inches : " + centimeters + " cm");
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double centimeters = 0;
        if (inches >= 0) {
            double feetFromInches = inches / 12;
            double remainingInches = inches % 12;
            centimeters = calcFeetAndInchesToCentimeters(feetFromInches, remainingInches);
        } else {
            centimeters = -1;
        }
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = 0;
        if (feet >= 0) {
            if ((inches >= 0) && (inches <= 12)) {
                double feetToInches = feet * 12.0;
                double totalInches = feetToInches + inches;
                centimeters = totalInches * 2.54;
            } else {
                centimeters = -1;
            }
        } else {
            centimeters = -1;
        }
        return centimeters;
    }
}
