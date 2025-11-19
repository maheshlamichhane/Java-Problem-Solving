import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS21_RegExUsername {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Za-z][A-Za-z0-9_]{7,29}$");
        Matcher matcher = pattern.matcher("mahesh048_sdklfjkl");
        boolean b = matcher.matches();
        System.out.println(b);

    }
}
