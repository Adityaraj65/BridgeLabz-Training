package day7;

import java.util.Scanner;

public class PowerFunction {
	public static int calculatePower(int n,int pow) {
		if(pow==1) {
			return n;
		}
		return n*calculatePower(n, pow-1);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		System.out.println("enter power");
		int power=sc.nextInt();
		int result=calculatePower(n,power);
		System.out.println(result);
	}
	
}
