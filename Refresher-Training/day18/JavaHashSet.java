package day18;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        HashSet<String>set=new HashSet<>();
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s1=sc.next();
            String s2=sc.next();
            set.add(s1+" "+s2);
            System.out.println(set.size());
        }
    }
}