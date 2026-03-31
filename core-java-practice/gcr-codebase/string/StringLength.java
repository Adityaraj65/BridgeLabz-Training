//level2 question no 1.
import java.util.*;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String text=sc.next();
          // Finding length manually
        int manualLength=stringLengthManually(text);
          // Finding length using built-in method
        int builtInLength=text.length();
         // Displaying results
        System.out.println("Length without using length(): " + manualLength);
        System.out.println("Length using built-in length(): " + builtInLength);

    }
    
    // Method to find string length without using length()
    public static int stringLengthManually(String text){
        int count=0;
         // Infinite loop to access characters one by one
        while (true) {
            try{
                text.charAt(count);
                count++;
            }catch(StringIndexOutOfBoundsException e){
                 // Exception occurs when index exceeds string length
                break;
            }
            
        }
        return count;
    }

}
