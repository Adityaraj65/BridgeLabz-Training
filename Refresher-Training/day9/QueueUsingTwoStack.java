package day9;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStack {
     static Stack<Integer> s1=new Stack<>();
       static  Stack<Integer>s2=new Stack<>();
    public static void performEnque(int n){
        if(s2.isEmpty()){
            s1.push(n);
            return;
        }
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        s1.push(n);
    }
   public static void deque() {

    if (s1.isEmpty()) {
        s2.pop();
        return;
    }
    while (!s1.isEmpty()) {
        s2.push(s1.pop());
    }

    s2.pop();
}
    public static int print() {

    if (s1.isEmpty()) {
        return s2.peek();
    }
    while (!s1.isEmpty()) {
        s2.push(s1.pop());
    }
    return s2.peek();
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m == 1) {
                int enq = sc.nextInt();
                performEnque(enq);
            } else if (m == 2) {
                deque();
            } else if (m == 3) {
                System.out.println(print());
            }
        }
        
       
    }
}
