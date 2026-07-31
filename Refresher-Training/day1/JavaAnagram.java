package day1;

import java.util.Scanner;

public class JavaAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
         a=a.toLowerCase();
         b=b.toLowerCase();
         if(a.length()!=b.length()){
            return false;
         }
        int[] freq=new int[26];
        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)-'a']++;
            freq[b.charAt(i)-'a']--;
            
        }
        for(int f:freq){
            if(f!=0){
                return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first string ");
        String a = scan.next();
        System.out.println("enter second string");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        if(ret) {
        	System.out.println("anagram");
        	
        }else {
        	System.out.println("not anagram");
			
		}
    }
}