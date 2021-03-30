import java.awt.*;

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
        System.out.println("ChallengeSpeedConverter toMilesPerHour Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(10.25);
        System.out.println("ChallengeSpeedConverter toMilesPerHour Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(-5.6);
        System.out.println("ChallengeSpeedConverter toMilesPerHour Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(25.42);
        System.out.println("ChallengeSpeedConverter toMilesPerHour Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(75.114);
        System.out.println("ChallengeSpeedConverter toMilesPerHour Result is: " + longResult);
        longResult = ChallengeSpeedConverter.toMilesPerHour(0);
        System.out.println("ChallengeSpeedConverter toMilesPerHour Result is: " + longResult);

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
        System.out.println("ChallengeBarkingDog shouldWakeUp Result is: " + booleanResult);
        booleanResult = ChallengeBarkingDog.shouldWakeUp(false, 2);
        System.out.println("ChallengeBarkingDog shouldWakeUp Result is: " + booleanResult);
        booleanResult = ChallengeBarkingDog.shouldWakeUp(true, 8);
        System.out.println("ChallengeBarkingDog shouldWakeUp Result is: " + booleanResult);
        booleanResult = ChallengeBarkingDog.shouldWakeUp(true, -1);
        System.out.println("ChallengeBarkingDog shouldWakeUp Result is: " + booleanResult);

        // Leap Year Test
        booleanResult = ChallengeLeapYear.isLeapYear(-1600);
        System.out.println("ChallengeLeapYear isLeapYear Result is: " + booleanResult);
        booleanResult = ChallengeLeapYear.isLeapYear(1600);
        System.out.println("ChallengeLeapYear isLeapYear Result is: " + booleanResult);
        booleanResult = ChallengeLeapYear.isLeapYear(2017);
        System.out.println("ChallengeLeapYear isLeapYear Result is: " + booleanResult);
        booleanResult = ChallengeLeapYear.isLeapYear(2000);
        System.out.println("ChallengeLeapYear isLeapYear Result is: " + booleanResult);

        // Decimal Compare Test
        booleanResult = ChallengeDecimalCompare.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("ChallengeDecimalCompare areEqualByThreeDecimalPlaces Result is: " + booleanResult);
        booleanResult = ChallengeDecimalCompare.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("ChallengeDecimalCompare areEqualByThreeDecimalPlaces Result is: " + booleanResult);
        booleanResult = ChallengeDecimalCompare.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println("ChallengeDecimalCompare areEqualByThreeDecimalPlaces Result is: " + booleanResult);
        booleanResult = ChallengeDecimalCompare.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println("ChallengeDecimalCompare areEqualByThreeDecimalPlaces Result is: " + booleanResult);

        // Equal Sum Checker Test
        booleanResult = ChallengeEqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println("ChallengeEqualSumChecker hasEqualSum Result is: " + booleanResult);
        booleanResult = ChallengeEqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println("ChallengeEqualSumChecker hasEqualSum Result is: " + booleanResult);
        booleanResult = ChallengeEqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println("ChallengeEqualSumChecker hasEqualSum Result is: " + booleanResult);

        // Is Teen Test
        booleanResult = ChallengeTeenNumberChecker.isTeen(9);
        System.out.println("ChallengeTeenNumberChecker isTeen Result is: " + booleanResult);
        booleanResult = ChallengeTeenNumberChecker.isTeen(13);
        System.out.println("ChallengeTeenNumberChecker isTeen Result is: " + booleanResult);

        booleanResult = ChallengeTeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println("ChallengeTeenNumberChecker hasTeen Result is: " + booleanResult);
        booleanResult = ChallengeTeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println("ChallengeTeenNumberChecker hasTeen Result is: " + booleanResult);
        booleanResult = ChallengeTeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println("ChallengeTeenNumberChecker hasTeen Result is: " + booleanResult);

        // Playing Cat Test
        booleanResult = ChallengePlayingCat.isCatPlaying(true, 10);
        System.out.println("ChallengePlayingCat isCatPlaying Result is : " + booleanResult);
        booleanResult = ChallengePlayingCat.isCatPlaying(false, 36);
        System.out.println("ChallengePlayingCat isCatPlaying Result is : " + booleanResult);
        booleanResult = ChallengePlayingCat.isCatPlaying(false, 35);
        System.out.println("ChallengePlayingCat isCatPlaying Result is : " + booleanResult);

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
        System.out.println("ChallengeAreaCalculator area Result is : " + doubleResult);
        doubleResult = ChallengeAreaCalculator.area(-1);
        System.out.println("ChallengeAreaCalculator area Result is : " + doubleResult);
        doubleResult = ChallengeAreaCalculator.area(5.0, 4.0);
        System.out.println("ChallengeAreaCalculator area Result is : " + doubleResult);
        doubleResult = ChallengeAreaCalculator.area(-1.0, 4.0);
        System.out.println("ChallengeAreaCalculator area Result is : " + doubleResult);

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
        System.out.println("ChallengeNumberOfDaysMonth isLeapYear Result is : " + booleanResult);
        booleanResult = ChallengeNumberOfDaysMonth.isLeapYear(1600);
        System.out.println("ChallengeNumberOfDaysMonth isLeapYear Result is : " + booleanResult);
        booleanResult = ChallengeNumberOfDaysMonth.isLeapYear(1800);
        System.out.println("ChallengeNumberOfDaysMonth isLeapYear Result is : " + booleanResult);
        booleanResult = ChallengeNumberOfDaysMonth.isLeapYear(2017);
        System.out.println("ChallengeNumberOfDaysMonth isLeapYear Result is : " + booleanResult);
        booleanResult = ChallengeNumberOfDaysMonth.isLeapYear(2000);
        System.out.println("ChallengeNumberOfDaysMonth isLeapYear Result is : " + booleanResult);

        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(1,2020);
        System.out.println("ChallengeNumberOfDaysMonth getDaysInMonth Result is : " + longResult);
        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(2,2020);
        System.out.println("ChallengeNumberOfDaysMonth getDaysInMonth Result is : " + longResult);
        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(2,2018);
        System.out.println("ChallengeNumberOfDaysMonth getDaysInMonth Result is : " + longResult);
        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(-1,2020);
        System.out.println("ChallengeNumberOfDaysMonth getDaysInMonth Result is : " + longResult);
        longResult = ChallengeNumberOfDaysMonth.getDaysInMonth(1,-2020);
        System.out.println("ChallengeNumberOfDaysMonth getDaysInMonth Result is : " + longResult);

        // Sum Odd Test
        intResult = ChallengeSumOddRange.sumOdd(1, 100);
        System.out.println("ChallengeSumOdd sumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(-1, 100);
        System.out.println("ChallengeSumOdd sumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(100, 100);
        System.out.println("ChallengeSumOdd sumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(13, 13);
        System.out.println("ChallengeSumOdd sumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(100, -100);
        System.out.println("ChallengeSumOdd sumOdd Result is : " + intResult);
        intResult = ChallengeSumOddRange.sumOdd(100, 1000);
        System.out.println("ChallengeSumOdd sumOdd Result is : " + intResult);

        // Palindrome Test
        booleanResult = ChallengePalindrome.isPalindrome(-1221);
        System.out.println("ChallengePalindrome isPalindrome Result is : " + booleanResult);
        booleanResult = ChallengePalindrome.isPalindrome(707);
        System.out.println("ChallengePalindrome isPalindrome Result is : " + booleanResult);
        booleanResult = ChallengePalindrome.isPalindrome(11212);
        System.out.println("ChallengePalindrome isPalindrome Result is : " + booleanResult);
        booleanResult = ChallengePalindrome.isPalindrome(11211);
        System.out.println("ChallengePalindrome isPalindrome Result is : " + booleanResult);
        booleanResult = ChallengePalindrome.isPalindrome(12321);
        System.out.println("ChallengePalindrome isPalindrome Result is : " + booleanResult);
        booleanResult = ChallengePalindrome.isPalindrome(121);
        System.out.println("ChallengePalindrome isPalindrome Result is : " + booleanResult);
        booleanResult = ChallengePalindrome.isPalindrome(1001);
        System.out.println("ChallengePalindrome isPalindrome Result is : " + booleanResult);

        // Sum First Last Digit Test
        intResult = ChallengeSumFirstLastDigit.sumFirstAndLastDigit(0);
        System.out.println("ChallengeSumFirstLastDigit sumFirstAndLastDigit Result is : " + intResult);
        intResult = ChallengeSumFirstLastDigit.sumFirstAndLastDigit(-1);
        System.out.println("ChallengeSumFirstLastDigit sumFirstAndLastDigit Result is : " + intResult);
        intResult = ChallengeSumFirstLastDigit.sumFirstAndLastDigit(5);
        System.out.println("ChallengeSumFirstLastDigit sumFirstAndLastDigit Result is : " + intResult);
        intResult = ChallengeSumFirstLastDigit.sumFirstAndLastDigit(12);
        System.out.println("ChallengeSumFirstLastDigit sumFirstAndLastDigit Result is : " + intResult);
        intResult = ChallengeSumFirstLastDigit.sumFirstAndLastDigit(252);
        System.out.println("ChallengeSumFirstLastDigit sumFirstAndLastDigit Result is : " + intResult);
        intResult = ChallengeSumFirstLastDigit.sumFirstAndLastDigit(257);
        System.out.println("ChallengeSumFirstLastDigit sumFirstAndLastDigit Result is : " + intResult);
        intResult = ChallengeSumFirstLastDigit.sumFirstAndLastDigit(-10);
        System.out.println("ChallengeSumFirstLastDigit sumFirstAndLastDigit Result is : " + intResult);

        // Sum Even Digit Test
        intResult = ChallengeSumEvenDigit.getEvenDigitSum(-22);
        System.out.println("ChallengeSumEvenDigit getEvenDigitSum Result is : " + intResult);
        intResult = ChallengeSumEvenDigit.getEvenDigitSum(252);
        System.out.println("ChallengeSumEvenDigit getEvenDigitSum Result is : " + intResult);
        intResult = ChallengeSumEvenDigit.getEvenDigitSum(123456789);
        System.out.println("ChallengeSumEvenDigit getEvenDigitSum Result is : " + intResult);

        // Shared Digit Test
        booleanResult = ChallengeSharedDigit.hasSharedDigit(12,23);
        System.out.println("ChallengeSharedDigit hasSharedDigit Result is : " + booleanResult);
        booleanResult = ChallengeSharedDigit.hasSharedDigit(9,99);
        System.out.println("ChallengeSharedDigit hasSharedDigit Result is : " + booleanResult);
        booleanResult = ChallengeSharedDigit.hasSharedDigit(15,55);
        System.out.println("ChallengeSharedDigit hasSharedDigit Result is : " + booleanResult);
        booleanResult = ChallengeSharedDigit.hasSharedDigit(51,55);
        System.out.println("ChallengeSharedDigit hasSharedDigit Result is : " + booleanResult);
        booleanResult = ChallengeSharedDigit.hasSharedDigit(15,51);
        System.out.println("ChallengeSharedDigit hasSharedDigit Result is : " + booleanResult);

        // Last Digit Checker Test
        booleanResult = ChallengeLastDigitChecker.isValid(10);
        System.out.println("ChallengeLastDigitChecker isValid Result is : " + booleanResult);
        booleanResult = ChallengeLastDigitChecker.isValid(468);
        System.out.println("ChallengeLastDigitChecker isValid Result is : " + booleanResult);
        booleanResult = ChallengeLastDigitChecker.isValid(1051);
        System.out.println("ChallengeLastDigitChecker isValid Result is : " + booleanResult);

        booleanResult = ChallengeLastDigitChecker.hasSameLastDigit(41,22,71);
        System.out.println("ChallengeLastDigitChecker hasSameLastDigit Result is : " + booleanResult);
        booleanResult = ChallengeLastDigitChecker.hasSameLastDigit(23,32,42);
        System.out.println("ChallengeLastDigitChecker hasSameLastDigit Result is : " + booleanResult);
        booleanResult = ChallengeLastDigitChecker.hasSameLastDigit(9,99,999);
        System.out.println("ChallengeLastDigitChecker hasSameLastDigit Result is : " + booleanResult);
        booleanResult = ChallengeLastDigitChecker.hasSameLastDigit(10,100,1000);
        System.out.println("ChallengeLastDigitChecker hasSameLastDigit Result is : " + booleanResult);

        // Greatest Common Divisor Test
        intResult = ChallengeGreatestDivisor.getGreatestCommonDivisor(25, 15);
        System.out.println("ChallengeGreatestDivisor getGreatestCommonDivisor Result is : " + intResult);
        intResult = ChallengeGreatestDivisor.getGreatestCommonDivisor(12, 30);
        System.out.println("ChallengeGreatestDivisor getGreatestCommonDivisor Result is : " + intResult);
        intResult = ChallengeGreatestDivisor.getGreatestCommonDivisor(9, 18);
        System.out.println("ChallengeGreatestDivisor getGreatestCommonDivisor Result is : " + intResult);
        intResult = ChallengeGreatestDivisor.getGreatestCommonDivisor(81, 153);
        System.out.println("ChallengeGreatestDivisor getGreatestCommonDivisor Result is : " + intResult);

        // All Factors Test
        ChallengeAllFactors.printFactors(6);
        System.out.println("*******************");
        ChallengeAllFactors.printFactors(32);
        System.out.println("*******************");
        ChallengeAllFactors.printFactors(10);
        System.out.println("*******************");
        ChallengeAllFactors.printFactors(-1);

        // Perfect Numbers Test
        booleanResult = ChallengePerfectNumbers.isPerfectNumber(6);
        System.out.println("ChallengePerfectNumbers isPerfectNumber Result is : " + booleanResult);
        booleanResult = ChallengePerfectNumbers.isPerfectNumber(28);
        System.out.println("ChallengePerfectNumbers isPerfectNumber Result is : " + booleanResult);
        booleanResult = ChallengePerfectNumbers.isPerfectNumber(5);
        System.out.println("ChallengePerfectNumbers isPerfectNumber Result is : " + booleanResult);
        booleanResult = ChallengePerfectNumbers.isPerfectNumber(-1);
        System.out.println("ChallengePerfectNumbers isPerfectNumber Result is : " + booleanResult);

        // Number To Words Test
        intResult = ChallengeNumberToWords.getDigitCount(0);
        System.out.println("ChallengeNumberToWords getDigitCount Result is : " + intResult);
        intResult = ChallengeNumberToWords.getDigitCount(123);
        System.out.println("ChallengeNumberToWords getDigitCount Result is : " + intResult);
        intResult = ChallengeNumberToWords.getDigitCount(-12);
        System.out.println("ChallengeNumberToWords getDigitCount Result is : " + intResult);
        intResult = ChallengeNumberToWords.getDigitCount(5200);
        System.out.println("ChallengeNumberToWords getDigitCount Result is : " + intResult);
        intResult = ChallengeNumberToWords.getDigitCount(300);
        System.out.println("ChallengeNumberToWords getDigitCount Result is : " + intResult);

        System.out.println("*******************");

        intResult = ChallengeNumberToWords.reverse(0);
        System.out.println("ChallengeNumberToWords reverse Result is : " + intResult);
        intResult = ChallengeNumberToWords.reverse(-121);
        System.out.println("ChallengeNumberToWords reverse Result is : " + intResult);
        intResult = ChallengeNumberToWords.reverse(1212);
        System.out.println("ChallengeNumberToWords reverse Result is : " + intResult);
        intResult = ChallengeNumberToWords.reverse(1234);
        System.out.println("ChallengeNumberToWords reverse Result is : " + intResult);
        intResult = ChallengeNumberToWords.reverse(100);
        System.out.println("ChallengeNumberToWords reverse Result is : " + intResult);

        System.out.println("*******************");

        ChallengeNumberToWords.numberToWords(123);
        ChallengeNumberToWords.numberToWords(1010);
        ChallengeNumberToWords.numberToWords(1000);
        ChallengeNumberToWords.numberToWords(0);
        ChallengeNumberToWords.numberToWords(-12);

        // Flour Pack Test
        booleanResult = ChallengeFlourPack.canPack(1,0,4);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(1,0,5);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(0,5,4);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(2,2,11);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(2,2,12);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(-3,2,12);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(0,0,0);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(6,2,17);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(2,9,17);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(1,0,6);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(1,1,6);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(2,0,6);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(2,1,5);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(0,5,6);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);
        booleanResult = ChallengeFlourPack.canPack(0,6,5);
        System.out.println("ChallengeFlourPack canPack Result is : " + booleanResult);

        // Largest Prime Test
        intResult = ChallengeLargestPrime.getLargestPrime(21);
        System.out.println("ChallengeLargestPrime getLargestPrime Result is : " + intResult);
        intResult = ChallengeLargestPrime.getLargestPrime(217);
        System.out.println("ChallengeLargestPrime getLargestPrime Result is : " + intResult);
        intResult = ChallengeLargestPrime.getLargestPrime(0);
        System.out.println("ChallengeLargestPrime getLargestPrime Result is : " + intResult);
        intResult = ChallengeLargestPrime.getLargestPrime(45);
        System.out.println("ChallengeLargestPrime getLargestPrime Result is : " + intResult);
        intResult = ChallengeLargestPrime.getLargestPrime(-1);
        System.out.println("ChallengeLargestPrime getLargestPrime Result is : " + intResult);

        // Diagonal Star Test
        ChallengeDiagonalStar.printSquareStar(5);
        ChallengeDiagonalStar.printSquareStar(3);
        ChallengeDiagonalStar.printSquareStar(8);

        // Input Calculator Test
        ChallengeInputCalculator.inputThenPrintSumAndAverage();

        // Paint Job Test
        intResult = ChallengePaintJob.getBucketCount(-3.4, 2.1, 1.5, 2);
        System.out.println("ChallengePaintJob getBucketCount Result is : " + intResult);
        intResult = ChallengePaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println("ChallengePaintJob getBucketCount Result is : " + intResult);
        intResult = ChallengePaintJob.getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println("ChallengePaintJob getBucketCount Result is : " + intResult);

        System.out.println(" *********************************** ");

        intResult = ChallengePaintJob.getBucketCount(-3.4, 2.1, 1.5);
        System.out.println("ChallengePaintJob getBucketCount Result is : " + intResult);
        intResult = ChallengePaintJob.getBucketCount(3.4, 2.1, 1.5);
        System.out.println("ChallengePaintJob getBucketCount Result is : " + intResult);
        intResult = ChallengePaintJob.getBucketCount(7.25, 4.3, 2.35);
        System.out.println("ChallengePaintJob getBucketCount Result is : " + intResult);

        System.out.println(" *********************************** ");

        intResult = ChallengePaintJob.getBucketCount(3.4, 1.5);
        System.out.println("ChallengePaintJob getBucketCount Result is : " + intResult);
        intResult = ChallengePaintJob.getBucketCount(6.26, 2.2);
        System.out.println("ChallengePaintJob getBucketCount Result is : " + intResult);
        intResult = ChallengePaintJob.getBucketCount(3.26, 0.75);
        System.out.println("ChallengePaintJob getBucketCount Result is : " + intResult);

        // Simple Calculator Test
        ChallengeSimpleCalculator calculator = new ChallengeSimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

        // Person Test
        ChallengePerson person = new ChallengePerson();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName = " + person.getFullName());

        // Wall Area Test
        ChallengeWallArea wall = new ChallengeWallArea(5, 4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

        // Point Test
        ChallengePoint first = new ChallengePoint(6,5);
        doubleResult = first.distance();
        System.out.println("ChallengePoint distance Result is : " + doubleResult);
        ChallengePoint second = new ChallengePoint(3,1);
        doubleResult = first.distance(second);
        System.out.println("ChallengePoint distance Result is : " + doubleResult);
        doubleResult = first.distance(2,2);
        System.out.println("ChallengePoint distance Result is : " + doubleResult);
        ChallengePoint point = new ChallengePoint();
        doubleResult = point.distance();
        System.out.println("ChallengePoint distance Result is : " + doubleResult);
        ChallengePoint testPoint = new ChallengePoint(1,-1);
        doubleResult = testPoint.distance();
        System.out.println("ChallengePoint distance Result is : " + doubleResult);

        // Calculator Carpet Test
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        ChallengeCalculator calc = new ChallengeCalculator(floor, carpet);
        doubleResult = calc.getTotalCost();
        System.out.println("ChallengeCalculator getTotalCost Result is : " + doubleResult);
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calc= new ChallengeCalculator(floor, carpet);
        doubleResult = calc.getTotalCost();
        System.out.println("ChallengeCalculator getTotalCost Result is : " + doubleResult);


        // Complex Number Test
        ChallengeComplexNumber one = new ChallengeComplexNumber(1.0, 1.0);
        ChallengeComplexNumber number = new ChallengeComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());

        // Cylinder Inheritance Test
        ChallengeCircle circle = new ChallengeCircle(3.75);
        doubleResult = circle.getRadius();
        System.out.println("circle.radius= " + doubleResult);
        doubleResult = circle.getArea();
        System.out.println("circle.area= " + doubleResult);

        ChallengeCylinder cylinder = new ChallengeCylinder(5.55, 7.25);
        doubleResult = cylinder.getRadius();
        System.out.println("cylinder.radius= " + doubleResult);
        doubleResult = cylinder.getHeight();
        System.out.println("cylinder.height= " + doubleResult);
        doubleResult = cylinder.getArea();
        System.out.println("cylinder.area= " + doubleResult);
        doubleResult = cylinder.getVolume();
        System.out.println("cylinder.area= " + doubleResult);


        // Cuboid Inheritance Test

        ChallengeRectangle rectangle = new ChallengeRectangle(5, 10);
        doubleResult = rectangle.getWidth();
        System.out.println("rectangle.width= " + doubleResult);
        doubleResult = rectangle.getLength();
        System.out.println("rectangle.length= " + doubleResult);
        doubleResult = rectangle.getArea();
        System.out.println("rectangle.area= " + doubleResult);

        ChallengeCuboid cuboid = new ChallengeCuboid(5,10,5);
        doubleResult = cuboid.getWidth();
        System.out.println("cuboid.width= " + doubleResult);
        doubleResult = cuboid.getLength();
        System.out.println("cuboid.length= " + doubleResult);
        doubleResult = cuboid.getArea();
        System.out.println("cuboid.area= " + doubleResult);
        doubleResult = cuboid.getHeight();
        System.out.println("cuboid.height= " + doubleResult);
        doubleResult = cuboid.getVolume();
        System.out.println("cuboid.volume= " + doubleResult);


         */

        // OOP Burger Test
        Hamburger hamburger = new Hamburger("Basic", "sausage",3.56, "white");
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        System.out.println("Total Burger price is : " + hamburger.itemizeHamburger());

        System.out.println("***********************************");

        HealthyBurger healthyHamburger = new HealthyBurger("beacon",3.56);
        healthyHamburger.addHamburgerAddition1("Tomato",0.27);
        healthyHamburger.addHamburgerAddition2("Lettuce",0.75);
        healthyHamburger.addHamburgerAddition3("Cheese",1.13);
        healthyHamburger.addHamburgerAddition3("Potato",1.13);
        healthyHamburger.addHealthyAddition1("Egg",1.26);
        healthyHamburger.addHealthyAddition2("Peels",0.65);
        System.out.println("Total Healthy Burger price is : " + healthyHamburger.itemizeHamburger());

        System.out.println("***********************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("test",6.4);
        deluxeBurger.addHamburgerAddition2("test",23.98);
        System.out.println("Total Deluxe Burger price is : " + deluxeBurger.itemizeHamburger());


    }
}

