package collections;

import java.util.*;

public class RotateElement {

    static void rotate(ArrayList<Integer> list, int k) {

        int n = list.size();
        k = k % n;   // handle k greater than list size

        for (int i = 0; i < k; i++) {

            int first = list.remove(0); // remove first element
            list.add(first);            // add it at the end
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Input size of list
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input list elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Input rotation count
        System.out.print("Enter rotation value k: ");
        int k = sc.nextInt();

        rotate(list, k);

        // Print result
        System.out.println("Rotated List: " + list);

        sc.close();
    }
}

