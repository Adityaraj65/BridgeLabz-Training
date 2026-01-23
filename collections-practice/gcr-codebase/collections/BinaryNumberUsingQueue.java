package collections;

import java.util.*;

public class BinaryNumberUsingQueue {

    static void generateBinary(int n) {

        Queue<String> queue = new LinkedList<>();

        //  add first binary number
        queue.add("1");

        for (int i = 1; i <= n; i++) {

            // remove front element
            String current = queue.remove();


            System.out.print(current + " ");

            // add next two binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        generateBinary(5);
    }
}

