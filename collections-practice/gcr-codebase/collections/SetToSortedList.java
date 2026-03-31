package collections;

import java.util.*;

public class SetToSortedList {

    static List<Integer> convert(Set<Integer> set) {

        List<Integer> list = new ArrayList<>();

        // Copy elements from set to list
        for (int value : set) {
            list.add(value);
        }

        // Simple sorting using Collections
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        System.out.println(convert(set));
    }
}
