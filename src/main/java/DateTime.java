import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    // static fields: belong to the class and not to the object / or instance the class
    public static int year = 2023;
    // How to get current time in Java
    public void getTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println("Seconds: " + localTime.getSecond());
        System.out.println("Minutes:" + localTime.getMinute());
        System.out.println("Hour: " + localTime.getHour());

    }
    // How to get current date in Java
    public static void getDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today's date: " + localDate);
        System.out.println("The day of the month: " + localDate.getDayOfMonth());
        System.out.println("Month: " + localDate.getMonth());
        System.out.println("Year: " + localDate.getYear());

        System.out.println("How is your " + localDate.getDayOfWeek() + " ?");

    }
    // How to get current date time in Java
    public void getDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }

}
