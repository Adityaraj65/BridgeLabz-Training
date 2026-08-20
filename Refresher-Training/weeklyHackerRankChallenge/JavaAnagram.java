package weeklyHackerRankChallenge;

import java.util.Scanner;

public class JavaAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        String a1=a.toLowerCase();
        String b1=b.toLowerCase();
        char[] arr1=a1.toCharArray();
        char[] arr2=b1.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
       
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

