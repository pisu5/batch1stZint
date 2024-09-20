import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {

        Hashmap.stringKey();

    }

    public static void hashMap() {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "rahulmodi");
        hash.put(2, "kejrivaladityanath");
        // add struq

        String key = hash.get(1);
        System.out.println(key);
        hash.remove(1);
        System.out.println(hash.containsKey(1)); // true/false

    }

    public static void stringKey() {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("earth", 3);
        hash.put("pluto", 11);
        hash.put("earth", 6);

        // System.out.println(hash.get("earth"));
        // System.out.println(hash.isEmpty()); //
        // collection return all values fron an hasgmap
        // Collection<Integer> value = hash.values();
        // returns all keys from hash
        Set<String> keys = hash.keySet();
        System.out.println(keys);

    }

}
