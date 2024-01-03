import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Century {

    public static void isHundred(String birthday){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(birthday, formatter);
        System.out.println("Your birthday " + localDate);
        System.out.println("You’ll be 100 years old " + localDate.plus(1, ChronoUnit.CENTURIES));
    }
}
