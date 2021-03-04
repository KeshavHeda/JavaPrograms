public class ChallengeNumberOfDaysMonth {

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if ((year >= 1) && (year <= 9999)) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    isLeap = true;
                }
            } else if ((year % 4) == 0) {
                isLeap = true;
            }
        }
        return isLeap;
    }

    public static int getDaysInMonth(int month, int year) {
        int numberOfDays = -1;
        if ((month >= 1) && (month <= 12)) {
            if ((year >= 1) && (year <= 9999)) {
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        numberOfDays = 31;
                        break;
                    case 2:
                        if (isLeapYear(year)) {
                            numberOfDays = 29;
                        } else {
                            numberOfDays = 28;
                        }
                        break;
                    case 4: case 6: case 9: case 11:
                        numberOfDays = 30;
                        break;
                    default:
                        numberOfDays = -1;
                        break;
                }
            }
        }
        return  numberOfDays;
    }

}
