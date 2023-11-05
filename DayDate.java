import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayDate {
    public static void main(String[] args) {

        System.out.println("Usage: java DayOfWeekFinder <year> <month> <day>");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        int dayOfWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK);

        String dayName;

        switch (dayOfWeek) {
            case GregorianCalendar.SUNDAY:
                dayName = "Sunday";
                break;
            case GregorianCalendar.MONDAY:
                dayName = "Monday";
                break;
            case GregorianCalendar.TUESDAY:
                dayName = "Tuesday";
                break;
            case GregorianCalendar.WEDNESDAY:
                dayName = "Wednesday";
                break;
            case GregorianCalendar.THURSDAY:
                dayName = "Thursday";
                break;
            case GregorianCalendar.FRIDAY:
                dayName = "Friday";
                break;
            case GregorianCalendar.SATURDAY:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day of the week for " + month + "/" + day + "/" + year + " is " + dayName);
    }
}
