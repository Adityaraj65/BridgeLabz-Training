package day13;

import java.util.Scanner;

class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enter c");
		int c=sc.nextInt();
		

		Calculator calc=new Calculator() ;
		//compiler will select add(int a,int b) because 2 nt argument are passed 
		System.out.println("sum of two int number is : "+calc.add(a,b));
		//compiler will select add(int a,int b,int c) because 3 int argument are passed 
		System.out.println("sum of three number is : "+calc.add(a, b, c));
		System.out.println("enter 1st double number");
		double a1=sc.nextDouble();
		System.out.println("enter 2nd double number");
		double b1=sc.nextDouble();
		//compiler will select add(double a,double b) because 2 double argument are passed 
		System.out.println("the sum of two double number is : "+calc.add(a1, b1));

	}
}
