package day1;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
	
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter number"+i);
			arr[i]=sc.nextInt();
		}
		System.out.println(arraySum(arr));

	}
	public static int arraySum(int [] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		return sum;
	}

}

