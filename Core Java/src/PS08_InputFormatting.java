import java.util.Scanner;

public class PS08_InputFormatting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNext()){
            String input = sc.nextLine();
            System.out.println(count+" "+input);
            count++;
        }
    }
}
