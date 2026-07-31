package day1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

    public static List<Integer> reverseArray(List<Integer> a) {

        int left = 0;
        int right = a.size() - 1;

        while (left < right) {

            int temp = a.get(left);
            a.set(left, a.get(right));
            a.set(right, temp);

            left++;
            right--;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number n");
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> result = reverseArray(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}