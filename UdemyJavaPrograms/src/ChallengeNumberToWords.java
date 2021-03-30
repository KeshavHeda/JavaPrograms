public class ChallengeNumberToWords {
    public static int getDigitCount(int number) {
        int digitsCount = -1;
        if (number >= 0) {
            if (number > 0) {
                digitsCount = 0;
                while (number != 0) {
                    digitsCount++;
                    number = number / 10;
                }
            } else {
                digitsCount = 1;
            }
        }
        return digitsCount;
    }

    public static int reverse(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            int leastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + leastDigit;
            number = number / 10;
        }
        return reverseNumber;
    }

    public static void numberToWords(int number) {
        int reversedNumber = reverse(number);
        if (reversedNumber < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (reversedNumber == 0) {
            System.out.println("Zero");
            return;
        }

        int numberDigits = getDigitCount(number);
        int reverseDigits = getDigitCount(reversedNumber);

        while (reversedNumber != 0) {
            int leastDigit = reversedNumber % 10;
            switch (leastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber = reversedNumber / 10;
        }

        if ((numberDigits >= 0) && (reverseDigits >= 0)) {
            for (int i = reverseDigits; i < numberDigits; i++) {
                System.out.println("Zero");
            }
        }

    }

}
