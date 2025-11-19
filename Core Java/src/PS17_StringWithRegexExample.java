import java.util.Scanner;

public class PS17_StringWithRegexExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String[] tokens;
        if(!s.isEmpty()){
            tokens = s.split("[^A-Za-z]+");
            System.out.println(tokens.length);
            for(String ss : tokens){
                System.out.println(ss);
            }
        }
        else{
            System.out.println("0");
        }
        scan.close();
    }
}
