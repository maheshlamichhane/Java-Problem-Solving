import java.util.Scanner;

public class PS01_ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);


        System.out.println("Enter 3 Integers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        scan.close();
        scanner.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
