public class PS24_PalindromeWithoutReverseFn {

    public static void main(String[] args) {
        System.out.println("isPalindrome="+isPalindrome("madam"));
    }

    public static boolean isPalindrome(String s){
        char[] ch = s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
