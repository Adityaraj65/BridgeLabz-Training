package questionBank;

import java.util.Scanner;

abstract class  Calculator{
	abstract int add(int a,int b);
	
}
class Adder extends Calculator {
	@Override
	int add(int a,int b) {
	
		return a+b;
	}
	
}
class Multiplier extends Adder{
	 void multiply(int a,int b) {
		 int result=0;
		while(b>=1) {
			System.out.println("Adding: "+a+" , "+result);
			result=add(a, result);
			
			b--;
		}
		System.out.println("result of multiply is : "+ result);
	}
}
public class CustomCalculator {
	public static void main(String[] args) {
		Adder a=new Adder();
		Multiplier m=new Multiplier();
		Scanner sc=new Scanner(System.in);
		int a1 =sc.nextInt();
		int b=sc.nextInt();
		System.out.println("adding"+a1+","+b);
		int result=a.add(a1, b);
		System.out.println("sum "+result);
		m.multiply(a1, b);
		
		
				
	}
      
}
