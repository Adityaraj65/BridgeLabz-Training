package collections;

import java.util.*;

public class MergeMaps {

    // Merges two maps and sums values for duplicate keys
    public static Map<String, Integer> mergeMaps(
            Map<String, Integer> map1,
            Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>();

        // Copy all entries from first map
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }

        // Merge entries from second map
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            String key = entry.getKey();
            int value = entry.getValue();

            result.put(key, result.getOrDefault(key, 0) + value);
        }

        return result;
    }

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println(mergeMaps(map1, map2));
    }
}

