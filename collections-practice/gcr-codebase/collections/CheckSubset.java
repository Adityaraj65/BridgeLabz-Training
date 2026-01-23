package collections;

import java.util.*;

public class CheckSubset {

    static boolean isSubset(Set<Integer> smallSet, Set<Integer> largeSet) {

        // Check every element of smallSet in largeSet
        for (int value : smallSet) {
            if (!largeSet.contains(value)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(isSubset(set1, set2));
    }
}
