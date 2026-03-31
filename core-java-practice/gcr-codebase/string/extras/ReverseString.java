import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse="";
        for(int i=s.length();i>=0;i--){
            reverse=reverse+s.charAt(i);

        }
        System.out.println("Reversed string is : " + reverse);

        sc.close();

    }
}
