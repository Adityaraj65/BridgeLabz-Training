package collections;

import java.util.*;

public class UnionIntersection {

    // Method to find Union
    static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> union = new HashSet<>();

        // Add all elements of first set
        for (int value : set1) {
            union.add(value);
        }

        // Add all elements of second set
        for (int value : set2) {
            union.add(value);
        }

        return union;
    }

    // Method to find Intersection
    static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> intersection = new HashSet<>();

        // Check common elements
        for (int value : set1) {
            if (set2.contains(value)) {
                intersection.add(value);
            }
        }

        return intersection;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Union: " + findUnion(set1, set2));
        System.out.println("Intersection: " + findIntersection(set1, set2));
    }
}

