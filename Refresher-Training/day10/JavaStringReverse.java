package day10;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=A.length()-1;i>=0;i--){
            sb.append(A.charAt(i));
        }
        String B=sb.toString();
        if(A.equals(B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



