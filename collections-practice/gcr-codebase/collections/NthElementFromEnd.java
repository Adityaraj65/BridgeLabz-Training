package collections;

import java.util.*;

public class NthElementFromEnd {

    static String findNthFromEnd(LinkedList<String> list, int n) {

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                return "N is greater than list size";
            }
        }

        // Move both pointers until fast reaches end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        // Slow pointer now at nth from end
        return slow.next();
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        String result = findNthFromEnd(list, n);
        System.out.println("Nth element from end: " + result);
    }
}

