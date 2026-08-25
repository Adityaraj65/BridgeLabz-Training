package questionBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountPalindrome {
	public static int palindromeCount(List<List<String>> l) {
		int count=0;
		for(List<String> list:l) {
			for(String s:list) {
				if(isPalindrome(s)) {
					count++;
				}
			}
		}
		return count;
	}
	public static boolean  isPalindrome(String s) {
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	List<List<String>>list=new ArrayList<List<String>>();
    	System.out.println("enter length of outer list");
    	int n=sc.nextInt();
    	for(int i=0;i<n;i++) {
    		System.out.println("enter length of "+(i+1)+" inner list");
    		int m=sc.nextInt();
    		List<String>list1=new ArrayList<String>();
    		for(int j=0;j<m;j++) {
    		    System.out.println("enter string");
    			String str=sc.next();
    			list1.add(str);
    		}
    		list.add(list1);
    	}
    	System.out.println(palindromeCount(list));
    			
	
}
}
