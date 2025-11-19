public class PS14_StringLargeSmallExample {

    public static void main(String[] args) {

        System.out.println(getSmallestAndLargest("welcometojava",3));
    }

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for(int i=0; i<s.length()-k+1;i++){
            String extractedData = s.substring(i,i+k);
            System.out.println(extractedData);
            if(extractedData.compareTo(largest) > 0){
                largest = s.substring(i,i+k);
            }
            if(extractedData.compareTo(smallest) < 0){
                smallest = s.substring(i,i+k);
            }
        }

        return smallest + "\n" + largest;
    }
}

