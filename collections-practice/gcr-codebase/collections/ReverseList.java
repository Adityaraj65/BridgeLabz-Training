package collections;

import java.util.*;

public class ReverseList {

    // Reverse ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {

        int i = 0;                     // start index
        int j = list.size() - 1;       // last index

        while (i < j) {

            int temp = list.get(i);    // store first value
            list.set(i, list.get(j));  // put last value at first position
            list.set(j, temp);         // put stored value at last position

            i++;
            j--;
        }
    }

    // Reverse LinkedList
    static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {

        LinkedList<Integer> newList = new LinkedList<>();

        for (int value : list) {
            newList.addFirst(value);   // add element at start
        }

        return newList;
    }

    public static void main(String[] args) {

        // ArrayList example
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        reverseArrayList(arrayList);
        System.out.println("ArrayList reversed: " + arrayList);

        // LinkedList example
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList = reverseLinkedList(linkedList);
        System.out.println("LinkedList reversed: " + linkedList);
    }
}

