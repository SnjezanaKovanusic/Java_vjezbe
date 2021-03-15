package StringIKarakter;

public class DayOfMonth_4_17 {
    /*(Days of a month) Write a program that prompts the user to enter a year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month*/
    public static void main(String[] args) {


        int year = 2020;
        String monthName = "apr";
        int day = 0;
        if (monthName.equals("Jan") || monthName.equals("Mar") ||
                monthName.equals("Maj") || monthName.equals("Jul")
                || monthName.equals("Avg") || monthName.equals("Okt") ||
                monthName.equals("Dec")) {
            day = 31;
        } else if (monthName.equals("feb")) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                day = 29;
            } else {
                day = 28;
            }

        } else {
            day = 30;
        }
        System.out.println(monthName + " " + year + " has " + day + " days! ");
    }
}