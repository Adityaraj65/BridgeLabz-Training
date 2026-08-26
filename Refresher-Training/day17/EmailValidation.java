package day17;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			String str=sc.nextLine();
			System.out.println(isValid(str));
		}
		
	}
	public static boolean isValid(String str) {
		return str.matches( "^(?!.*\\.\\.)[a-z0-9_%+-]+(?:\\.[a-z0-9_%+-]+)*@[a-z0-9-]+(?:\\.[a-z0-9-]+)*\\.[a-z]{2,}$"); 
	}
}
