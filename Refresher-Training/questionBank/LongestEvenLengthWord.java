package questionBank;

import java.util.Scanner;

public class LongestEvenLengthWord {
	public static String longestWord(String str) {
		String arr[]=str.split(" ");
		int maxLength=0;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0&&arr[i].length()>maxLength) {
				maxLength=arr[i].length();
				index=i;
			}
		}
		return arr[index];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(longestWord(str));
	}
	
}
