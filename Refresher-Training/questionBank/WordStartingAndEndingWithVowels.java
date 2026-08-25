package questionBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordStartingAndEndingWithVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		List<String>list=checkWord(arr);
		System.out.println(list);
		
	}
	public static List<String> checkWord(String[] arr) {
		List<String>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			String str=arr[i].toLowerCase();
			if(isVowel(str.charAt(0))&&isVowel(str.charAt(str.length()-1))) {
				
				list.add(str);
			}
		}
		return list;
		
	}
	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
	}
}
