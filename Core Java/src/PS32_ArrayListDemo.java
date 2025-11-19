import java.util.Arrays;
import java.util.Scanner;

public class PS32_ArrayListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int numOfWord = sc.nextInt();
            for (int j = 1; j <= numOfWord; j++) {
                int num = sc.nextInt();

            }
        }
        int[] arr = new PS32_ArrayListDemo().twoSum(new int[]{1,2,3,4,5}, 6);
        System.out.println(Arrays.toString(arr));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                   return new int[]{i, j};
                }
            }
        }
        return  null;
    }
}



