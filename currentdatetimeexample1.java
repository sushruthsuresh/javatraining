import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class currentdatetimeexample1 {
    public static void main(String[] args) {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
        LocalDateTime now= LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
