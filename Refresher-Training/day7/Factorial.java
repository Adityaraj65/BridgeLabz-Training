package day7;

import java.io.IOException;
import java.util.Scanner;



public class Factorial {
	  public static int factorial(int n) {
		    // Write your code here
		    if(n==1){
		        return 1;
		    }
		    return n*factorial(n-1);

		    }
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println(result);
    }
}

