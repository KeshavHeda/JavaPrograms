public class ChallengeSumFirstLastDigit {

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return  -1;
        }

        int sum = 0;
        if (number <= 9) {
            sum = sum + number + number;
        } else {
            int lastDigit = number % 10;
            sum += lastDigit;

            while (number >= 10) {
                number = number / 10;
            }
            sum += number;
        }

        return sum;

    }
}
