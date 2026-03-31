package collections;

import java.util.*;

public class SymmetricDifference {

    static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> result = new HashSet<>();

        // Elements in set1 but not in set2
        for (int value : set1) {
            if (!set2.contains(value)) {
                result.add(value);
            }
        }

        // Elements in set2 but not in set1
        for (int value : set2) {
            if (!set1.contains(value)) {
                result.add(value);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println(symmetricDifference(set1, set2));
    }
}

