package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();
        d = d % n;
        List<Integer> result = new ArrayList<>();
        for (int i = d; i < n; i++) {
            result.add(a.get(i));
        }
        for (int i = 0; i < d; i++) {
            result.add(a.get(i));
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = sc.nextInt();
        System.out.println("enter number of left rotation");
        int d = sc.nextInt();
        // creating new arrayList
        List<Integer> arr = new ArrayList<>();
        //taking input 
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        //calling rotleft method and storing result into result list
        List<Integer> result = rotLeft(arr, d);
        //printing output
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

