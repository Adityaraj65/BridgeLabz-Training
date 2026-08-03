package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> operations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            operations.add(sc.nextLine());
        }
        List<Integer> result = getMax(operations);

        for (int num : result) {
            System.out.println(num);
        }

        sc.close();
	}
	public static List<Integer> getMax(List<String> operations) {
	    // Write your code here
	    List<Integer> list=new ArrayList<>();
	    Stack<Integer> stack=new Stack<>();
	    Stack<Integer> maxStack=new Stack<>();
	    maxStack.push(Integer.MIN_VALUE);
	    for(int i=0;i<operations.size();i++){
	        String s1=operations.get(i);
	        String[] arr=s1.split(" ");
	        
	        
	        if(arr[0].equals("1")){
	            int num=Integer.parseInt(arr[1]);
	            stack.push(num);
	            if(num>=maxStack.peek()){
	                maxStack.push(num);
	            }
	            
	        }else if(arr[0].equals("2")){
	    
	           int top= stack.pop();
	            if(top==maxStack.peek()){
	                maxStack.pop();
	            }
	        }else{
	            int maximum=maxStack.peek();
	            list.add(maximum);
	        }
	    }
	    return list;
	    }
}
