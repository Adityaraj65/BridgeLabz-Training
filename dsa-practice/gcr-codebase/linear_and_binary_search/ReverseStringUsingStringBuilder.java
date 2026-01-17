package linear_and_binary_search;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        //scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        System.out.println(reverse(s));
    }
    static String reverse(String s) {
        //created a string builder
        StringBuilder sb = new StringBuilder();
        //append string to stringbuilder
        sb.append(s);
//        reverse string
        sb.reverse();
        return sb.toString();
    }

}

