import java.util.HashMap;
import java.util.Map;

public class PS25_DuplicateChar {

    public static void main(String[] args) {
        findDuplicate("mahesh lamichhane");
    }

    public static void findDuplicate(String s){
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        map
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));

    }
}
