package day7;

import java.util.Scanner;

public class JavaStringReverse {
    public static boolean isPlaindrome(String a,int i,int j){
        if(i>=j){
            return true;
        }
        if(a.charAt(i)!=a.charAt(j)){
            return false;
        }
        return isPlaindrome(a,i+1,j-1);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i=0;
        int j=A.length()-1;
        boolean result=isPlaindrome(A, i, j);
        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
       
       
        
    }
}







