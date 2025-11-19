import java.util.Arrays;

public class PS16_AnagramExample {

    public static void main(String[] args) {
       System.out.println(isAnagram("Hello","hello"));
    }

    static boolean isAnagram(String aa, String bb) {

//        char[] aArray = a.toCharArray();
//        char[] bArray = b.toCharArray();
//        Arrays.sort(aArray);
//        Arrays.sort(bArray);
//        System.out.println(Arrays.equals(aArray,bArray));
//        return false;

        String a = aa.toLowerCase();
        String b = bb.toLowerCase();

        if(a.length()!=b.length()) return false;

        if((!a.isEmpty() && a.length() <=50) && (!b.isEmpty() && b.length() <=50)){
            int[] array=new int[256];
            for(char ch1: a.toCharArray()){
                array[ch1] = array[ch1]+1;
            }
            for(char ch2: b.toCharArray()){
                array[ch2] = array[ch2]-1;
            }
            for(int x : array){
                if(x!=0) return false;
            }
        }
        return true;
    }
}
