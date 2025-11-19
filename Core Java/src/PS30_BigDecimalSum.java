import java.math.BigDecimal;
import java.util.Scanner;

public class PS30_BigDecimalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal x = new BigDecimal(sc.next());
        BigDecimal y = new BigDecimal(sc.next());

        System.out.println(x.add(y));
        System.out.println(y.multiply(x));
    }
}
