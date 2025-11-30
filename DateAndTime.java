import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
public class DateAndTime {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dT = LocalDateTime.now();
        Instant instant = Instant.now();
        ZonedDateTime zDT = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(date);
        System.out.println(time);
        System.out.println(dT);
        System.out.println(instant);
        System.out.println(zDT);
    }
}
