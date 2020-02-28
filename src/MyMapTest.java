import java.util.*;

public class MyMapTest {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Do Van Long",1);
        hashMap.put("Dao Duy Anh",2);
        hashMap.put("Tran Hoang Nam",3);
        hashMap.put("Cao Tien Anh",4);
        System.out.println("\nHashMap is: \n"+hashMap);
        TreeMap<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("\nDisplay entries in ascending order of key: ");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println("\nOrder number of Do Van Long is: "+linkedHashMap.get("Do Van Long"));
    }
}
