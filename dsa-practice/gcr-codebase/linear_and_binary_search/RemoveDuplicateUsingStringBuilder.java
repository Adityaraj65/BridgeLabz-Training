package linear_and_binary_search;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateUsingStringBuilder {
    public static void main(String[] args) {
        //scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        //calling removeDuplicate() method and printing result
        System.out.println(removeDuplicate(s));
    }
    //method to remove duplicate
    static String removeDuplicate(String s){
        //string builder
        StringBuilder sb=new StringBuilder();
        //hashset to store unique character
        HashSet<Character>hashset=new HashSet<>();
        //loop to iterate each character
        for(int i=0;i<s.length();i++){
            if(!hashset.contains(s.charAt(i))){
          // appending character which are not present in hashset
                sb.append(s.charAt(i));

                hashset.add(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
