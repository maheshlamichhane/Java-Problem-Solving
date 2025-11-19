import java.util.Scanner;

public class PS15_PalindromeExample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer buffer = new StringBuffer(A);
        buffer.reverse();
        if(A.equals(buffer.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
