package collections;

import java.util.*;

public class FrequencyOfElements {

    static Map<String, Integer> countFrequency(List<String> list) {

        Map<String, Integer> map = new HashMap<>();

        for (String item : list) {

            if (map.containsKey(item)) {
                // if word is already present then count+1
                map.put(item, map.get(item) + 1);
            } else {
                // if word  came for first time
                map.put(item, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        Map<String, Integer> result = countFrequency(list);

        System.out.println(result);
    }
}

