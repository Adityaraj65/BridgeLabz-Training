package scenarioBased.LexicalTwist;

import java.util.Scanner;

public class LexicalTwistProblem {
	public static boolean isVowel(char ch) {
		return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first word");
		String firstWord=sc.next();
		System.out.println("enter the second word");
		String secondWord=sc.next();
		StringBuffer sb=new StringBuffer(secondWord);
		String revers1=sb.reverse().toString();
		if(firstWord.equalsIgnoreCase(revers1)) {
			StringBuffer sb2=new StringBuffer(firstWord);
			String reverse2=sb2.reverse().toString();
			reverse2=reverse2.toLowerCase();
			reverse2=reverse2.replaceAll("[aeiou]", "@");
			System.out.println(reverse2);
			
			
		}else {
			String combineWord=firstWord+secondWord;
			combineWord=combineWord.toUpperCase();
			int vowelCount=0;
			int consonantCount=0;
			for(int i=0;i<combineWord.length();i++) {
				if(isVowel(combineWord.charAt(i))){
					vowelCount++;
				}else {
					consonantCount++;
				}
			}
			if(vowelCount>consonantCount) {
				int c=0;
				int i=0;
				String word="";
				
				while(c<2) {
					if(isVowel(combineWord.charAt(i))&&word.indexOf(combineWord.charAt(i))==-1){
						c++;
						word=word+combineWord.charAt(i);
					
						i++;
					}else {
						i++;
					}
				}
				System.out.println(word);
			}else {
				int c=0;
				int i=0;
				String word="";
			
				while(c<2) {
					if(!isVowel(combineWord.charAt(i))&&word.indexOf(combineWord.charAt(i))==-1){
						c++;
						
						word=word+combineWord.charAt(i);
				
						i++;
					}else {
						i++;
					}
				}
				System.out.println(word);
			}
		}
	}
}
