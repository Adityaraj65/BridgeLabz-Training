package algorithm_analysis;

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearchComparison {
    public static void main(String[] args) {

        int n = 1_000_000;     // dataset size
        int target = n - 1;    // element to search

        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Fill all data structures
        for (int i = 0; i < n; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        //array search
        long start = System.nanoTime();

        // Linear search in array
        for (int value : array) {
            if (value == target)
                break;
        }

        long arrayTime = System.nanoTime() - start;

        // hashset search
        start = System.nanoTime();
        hashSet.contains(target);
        long hashSetTime = System.nanoTime() - start;

        // treeset search
        start = System.nanoTime();
        treeSet.contains(target);
        long treeSetTime = System.nanoTime() - start;

        // Print execution times
        System.out.println("Array Search Time: " + arrayTime + " ns");
        System.out.println("HashSet Search Time: " + hashSetTime + " ns");
        System.out.println("TreeSet Search Time: " + treeSetTime + " ns");
    }
}
