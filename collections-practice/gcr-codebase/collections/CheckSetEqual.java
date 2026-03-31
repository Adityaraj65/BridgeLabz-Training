package collections;

import java.util.*;

public class CheckSetEqual {

    static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {

        // If sizes are different, sets cannot be equal
        if (set1.size() != set2.size()) {
            return false;
        }

        // Check every element of set1 in set2
        for (int value : set1) {
            if (!set2.contains(value)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println(areSetsEqual(set1, set2));
    }
}

