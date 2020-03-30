public class NextDayCalculator {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public static String tomorrow(int day, int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day == 29) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
            } else if (day == 28) {
                day = 1;
                month++;
            } else {
                day++;
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day == 31) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            } else {
                day++;
            }
        } else if (month == 4 | month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                day = 1;
                month++;
            } else {
                day++;
            }
        }
        return day + "/" + month + "/" + year;
    }
}