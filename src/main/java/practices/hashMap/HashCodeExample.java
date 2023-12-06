package practices.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeExample {
    public static void main(String[] args) {
        String name = "Gul";
        int hashCode = name.hashCode();
       // System.out.println(hashCode);

        Map<String, Integer> map = new HashMap<>();
        map.put("Gul", 89);
        map.put("Max", 90);
        map.put("John", 87);

        System.out.println(map.get("John"));

        Set<Integer> set = new HashSet<>();
        set.add(34);
        set.add(45);
        set.add(34);

        System.out.println(set);

    }
}
