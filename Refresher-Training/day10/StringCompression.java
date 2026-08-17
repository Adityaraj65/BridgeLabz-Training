package day10;

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}else{
				 if (count > 1) {
		                System.out.print(s.charAt(i - 1) + "" + count);
		            } 
		            else {
		                System.out.print(s.charAt(i - 1));
		            }
		            count = 1;
			}
		}
		if (count > 1) {
	        System.out.print(s.charAt(s.length() - 1) + "" + count);
	    } 
	    else {
	        System.out.print(s.charAt(s.length() - 1));
	    }
	}
}
