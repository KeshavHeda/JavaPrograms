public class ChallengeTester {
    public static void main(String[] args) {
        long longResult = 0;
        boolean booleanResult = false;
        double doubleResult = 0;
        int intResult = 0;

        /*

        // Check Number Test
        ChallengePositiveNegativeZero.checkNumber(0);
        ChallengePositiveNegativeZero.checkNumber(15);
        ChallengePositiveNegativeZero.checkNumber(-15);

        // Speed Converter Test
        longResult = ChallengeSpeedConverter.toMilesPerHour(1.5);
        System.out.println("ChallengeSpeedConverter Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(10.25);
        System.out.println("ChallengeSpeedConverter Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(-5.6);
        System.out.println("ChallengeSpeedConverter Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(25.42);
        System.out.println("ChallengeSpeedConverter Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(75.114);
        System.out.println("ChallengeSpeedConverter Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(0);
        System.out.println("ChallengeSpeedConverter Result is: " + longResult);

        ChallengeSpeedConverter.printConversion(1.5);
        ChallengeSpeedConverter.printConversion(10.25);
        ChallengeSpeedConverter.printConversion(-5.6);
        ChallengeSpeedConverter.printConversion(25.42);
        ChallengeSpeedConverter.printConversion(75.114);
        ChallengeSpeedConverter.printConversion(0);

        // MegaBytes Converter Test
        ChallengeMegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        ChallengeMegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        ChallengeMegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        // Barking Dog Test
        booleanResult = ChallengeBarkingDog.shouldWakeUp(true, 1);
        System.out.println("ChallengeBarkingDog Result is: " + booleanResult);
        booleanResult = ChallengeBarkingDog.shouldWakeUp(false, 2);
        System.out.println("ChallengeBarkingDog Result is: " + booleanResult);
        booleanResult = ChallengeBarkingDog.shouldWakeUp(true, 8);
        System.out.println("ChallengeBarkingDog Result is: " + booleanResult);
        booleanResult = ChallengeBarkingDog.shouldWakeUp(true, -1);
        System.out.println("ChallengeBarkingDog Result is: " + booleanResult);

        // Leap Year Test
        booleanResult = ChallengeLeapYear.isLeapYear(-1600);
        System.out.println("ChallengeLeapYear Result is: " + booleanResult);
        booleanResult = ChallengeLeapYear.isLeapYear(1600);
        System.out.println("ChallengeLeapYear Result is: " + booleanResult);
        booleanResult = ChallengeLeapYear.isLeapYear(2017);
        System.out.println("ChallengeLeapYear Result is: " + booleanResult);
        booleanResult = ChallengeLeapYear.isLeapYear(2000);
        System.out.println("ChallengeLeapYear Result is: " + booleanResult);

        // Decimal Compare Test
        booleanResult = ChallengeDecimalCompare.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("ChallengeDecimalCompare Result is: " + booleanResult);
        booleanResult = ChallengeDecimalCompare.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("ChallengeDecimalCompare Result is: " + booleanResult);
        booleanResult = ChallengeDecimalCompare.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println("ChallengeDecimalCompare Result is: " + booleanResult);
        booleanResult = ChallengeDecimalCompare.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println("ChallengeDecimalCompare Result is: " + booleanResult);

        // Equal Sum Checker Test
        booleanResult = ChallengeEqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println("ChallengeEqualSumChecker Result is: " + booleanResult);
        booleanResult = ChallengeEqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println("ChallengeEqualSumChecker Result is: " + booleanResult);
        booleanResult = ChallengeEqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println("ChallengeEqualSumChecker Result is: " + booleanResult);

        // Is Teen Test
        booleanResult = ChallengeTeenNumberChecker.isTeen(9);
        System.out.println("ChallengeTeenNumberChecker Result is: " + booleanResult);
        booleanResult = ChallengeTeenNumberChecker.isTeen(13);
        System.out.println("ChallengeTeenNumberChecker Result is: " + booleanResult);

        booleanResult = ChallengeTeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println("ChallengeTeenNumberChecker Result is: " + booleanResult);
        booleanResult = ChallengeTeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println("ChallengeTeenNumberChecker Result is: " + booleanResult);
        booleanResult = ChallengeTeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println("ChallengeTeenNumberChecker Result is: " + booleanResult);

        // Playing Cat Test
        booleanResult = ChallengePlayingCat.isCatPlaying(true, 10);
        System.out.println("ChallengePlayingCat Result is : " + booleanResult);
        booleanResult = ChallengePlayingCat.isCatPlaying(false, 36);
        System.out.println("ChallengePlayingCat Result is : " + booleanResult);
        booleanResult = ChallengePlayingCat.isCatPlaying(false, 35);
        System.out.println("ChallengePlayingCat Result is : " + booleanResult);

        // Minutes Year Days Test
        ChallengeMinutesYearDays.printYearsAndDays(-525600);
        ChallengeMinutesYearDays.printYearsAndDays(525600);
        ChallengeMinutesYearDays.printYearsAndDays(1051200);
        ChallengeMinutesYearDays.printYearsAndDays(561600);

        // Equality Printer Test
        ChallengeEqualityPrinter.printEqual(1,1,1);
        ChallengeEqualityPrinter.printEqual(1,1,2);
        ChallengeEqualityPrinter.printEqual(-1,-1,-1);
        ChallengeEqualityPrinter.printEqual(1,2,3);
        ChallengeEqualityPrinter.printEqual(1,2,1);

        // Area Calculator Test
        doubleResult = ChallengeAreaCalculator.area(5.0);
        System.out.println("ChallengeAreaCalculator Result is : " + doubleResult);
        doubleResult = ChallengeAreaCalculator.area(-1);
        System.out.println("ChallengeAreaCalculator Result is : " + doubleResult);
        doubleResult = ChallengeAreaCalculator.area(5.0, 4.0);
        System.out.println("ChallengeAreaCalculator Result is : " + doubleResult);
        doubleResult = ChallengeAreaCalculator.area(-1.0, 4.0);
        System.out.println("ChallengeAreaCalculator Result is : " + doubleResult);

        // Number In Word Test
        ChallengeNumberInWord.printNumberInWord(-1);
        ChallengeNumberInWord.printNumberInWord(0);
        ChallengeNumberInWord.printNumberInWord(1);
        ChallengeNumberInWord.printNumberInWord(2);
        ChallengeNumberInWord.printNumberInWord(3);
        ChallengeNumberInWord.printNumberInWord(4);
        ChallengeNumberInWord.printNumberInWord(5);
        ChallengeNumberInWord.printNumberInWord(6);
        ChallengeNumberInWord.printNumberInWord(7);
        ChallengeNumberInWord.printNumberInWord(8);
        ChallengeNumberInWord.printNumberInWord(9);
        ChallengeNumberInWord.printNumberInWord(10);

        ChallengeNumberInWord.printNumberInWordIf(-1);
        ChallengeNumberInWord.printNumberInWordIf(0);
        ChallengeNumberInWord.printNumberInWordIf(1);
        ChallengeNumberInWord.printNumberInWordIf(2);
        ChallengeNumberInWord.printNumberInWordIf(3);
        ChallengeNumberInWord.printNumberInWordIf(4);
        ChallengeNumberInWord.printNumberInWordIf(5);
        ChallengeNumberInWord.printNumberInWordIf(6);
        ChallengeNumberInWord.printNumberInWordIf(7);
        ChallengeNumberInWord.printNumberInWordIf(8);
        ChallengeNumberInWord.printNumberInWordIf(9);
        ChallengeNumberInWord.printNumberInWordIf(10);

        // Days In Month Test
        booleanResult = ChallengeNumberOfDaysMonth.isLeapYear(-1600);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + booleanResult);
        booleanResult = ChallengeNumberOfDaysMonth.isLeapYear(1600);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + booleanResult);
        booleanResult = ChallengeNumberOfDaysMonth.isLeapYear(1800);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + booleanResult);
        booleanResult = ChallengeNumberOfDaysMonth.isLeapYear(2017);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + booleanResult);
        booleanResult = ChallengeNumberOfDaysMonth.isLeapYear(2000);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + booleanResult);

        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(1,2020);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + longResult);
        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(2,2020);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + longResult);
        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(2,2018);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + longResult);
        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(-1,2020);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + longResult);
        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(1,-2020);
        System.out.println("ChallengeNumberOfDaysMonth Result is : " + longResult);

        // Sum Odd Test
        intResult = ChallengeSumOddRange.sumOdd(1, 100);
        System.out.println("ChallengeSumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(-1, 100);
        System.out.println("ChallengeSumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(100, 100);
        System.out.println("ChallengeSumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(13, 13);
        System.out.println("ChallengeSumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(100, -100);
        System.out.println("ChallengeSumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(100, 1000);
        System.out.println("ChallengeSumOdd Result is : " + intResult);

*/

    }
}

