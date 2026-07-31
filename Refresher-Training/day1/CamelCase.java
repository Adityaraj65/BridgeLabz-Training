package day1;


import java.util.Scanner;

public class CamelCase {

    public static int camelcase(String s) {
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.next();
        int result = camelcase(s);
        System.out.println(result);
        sc.close();
    }
}
