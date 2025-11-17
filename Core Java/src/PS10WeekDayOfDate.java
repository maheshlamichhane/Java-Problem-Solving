import java.time.LocalDate;
import java.util.Calendar;

public class PS10WeekDayOfDate {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1970);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

    }
}
