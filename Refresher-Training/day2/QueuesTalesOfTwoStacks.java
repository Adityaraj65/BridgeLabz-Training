package day2;

import java.util.Scanner;
import java.util.Stack;

public class QueuesTalesOfTwoStacks {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        sc.nextLine();
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        for(int i=0;i<q;i++){
            String str=sc.nextLine();
            String[] strArray=str.split(" ");
            int num1=Integer.parseInt(strArray[0]);
            if(num1==1){
                int num2=Integer.parseInt(strArray[1]);
                s1.push(num2);
                
            }else if(num1==2){
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                }s2.pop();
                
            }else{
                if(!s2.isEmpty()){
                    System.out.println(s2.peek());
                }else{
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                    System.out.println(s2.peek());
                }
                
            }
        }
        
    }
}