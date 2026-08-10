package day7;

import java.util.Scanner;

public class SuperDigit {
	public static long calculateSuperDigit(String s,int k) {
		long sum=0;
		for(char ch:s.toCharArray()) {
			sum+=ch-'0';
		}
		sum=sum*k;
		if(sum<10) {
			return sum;
		}
		return calculateSuperDigit(Long.toString(sum), 1);
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String n=sc.next();
	int k=sc.nextInt();
	System.out.println(calculateSuperDigit(n, k));
}
}
