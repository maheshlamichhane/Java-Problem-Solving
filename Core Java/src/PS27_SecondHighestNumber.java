public class PS27_SecondHighestNumber {

    public static void main(String[] args) {
        System.out.println("Second Highest Number="+findSecondHighest(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }

    public static int findSecondHighest(int[] nums){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i : nums){
            if(i > highest){
                secondHighest = highest;
                highest = i;
            }
            else if(i > secondHighest && i != highest){
                secondHighest = i;
            }
        }
        return secondHighest;
    }
}
