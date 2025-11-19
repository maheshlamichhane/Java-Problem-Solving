import java.util.HashMap;
import java.util.Map;

public class PS29_WordFrequency {

    static Map<String,Integer> map = new HashMap<>();

    public static void main(String[] args) {

        WordFrequency("Hello Hello World");
        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }

    public static void WordFrequency(String s){
        for(String str : s.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
    }
}
