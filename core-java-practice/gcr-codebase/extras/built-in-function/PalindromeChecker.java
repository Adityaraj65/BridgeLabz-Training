import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        // create a scanner object 
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        // check given string is palindrome or not 
        boolean result =ValidPalindrome(s);
        if(result){
            System.out.println("given word is palindrome");
        }else{
            System.out.println("Given word is not palindrome ");
        }
    }
    //method to check palindrome
    static boolean ValidPalindrome(String s ){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);
            //if char at left is not letter or digit in that case
            //increment i counter
            if(!Character.isLetterOrDigit(left)){
                i=i+1;
                continue;
            }
            //if char at right is not letter or digit in that case
            //decrement j counter
            if(!Character.isLetterOrDigit(right)){
                j=j-1;
                continue;
            }
            // check if left!=right in that case return false
            if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            i=i+1;
            j=j-1;
               
        }
        return true;
    }
}