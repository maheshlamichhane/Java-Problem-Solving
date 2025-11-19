import java.util.Scanner;

public class PS12_StringManipulationExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(capitalizeLetter(A)+" "+capitalizeLetter(B));
    }

    private static String capitalizeLetter(String s){
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
