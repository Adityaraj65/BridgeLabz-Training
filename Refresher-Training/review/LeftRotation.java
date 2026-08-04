package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            result.add(a.get((i + d) % a.size()));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        List<Integer> result = rotLeft(a, d);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        sc.close();
    }
}