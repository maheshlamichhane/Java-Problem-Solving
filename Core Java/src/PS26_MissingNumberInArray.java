public class PS26_MissingNumberInArray {

    public static void main(String[] args) {
        System.out.println("Missing Number="+missingNumber(new int[]{1,3,4,5}));
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length+1;
        long sum = n * (n+1)/2;
        for(int i : arr){
            sum -= i;
        }
        return (int) sum;
    }
}
