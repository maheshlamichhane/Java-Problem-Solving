import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PS28_RemoveDuplicateArrayList {
    public static void main(String[] args) {
        List<Integer> duplicates = new ArrayList<>();
        duplicates.add(1);
        duplicates.add(2);
        duplicates.add(4);
        duplicates.add(4);
        duplicates.add(5);
        ArrayList<Integer> filteredArrayLst = removeDuplicate(duplicates);
        for(Integer i : filteredArrayLst){
            System.out.println(i);
        }
    }


    public static ArrayList<Integer> removeDuplicate(List<Integer> arr){
        return new ArrayList<>(new LinkedHashSet<>(arr));
    }
}
