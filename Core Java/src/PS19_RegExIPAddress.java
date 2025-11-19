import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PS19_RegExIPAddress {
    public static void main(String[] args) {
        String pattern = "^((25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2}|0{1,2}\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2}|0{1,2}\\d)$\n";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher("192.168.100.1");
        boolean b = matcher.matches();
       if(b){
           System.out.println("true");
       }
       else {
           System.out.println("false");
       }
    }
}
