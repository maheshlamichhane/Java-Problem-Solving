import java.util.Scanner;

public class PS09StaticBlockExample {

    static int B;
    static int H;
    static boolean flag=true;

    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();


        if(B <= 0 || H <= 0){
            flag = false;
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
               System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
