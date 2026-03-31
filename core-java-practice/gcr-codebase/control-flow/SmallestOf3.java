import java.util.Scanner;
public class SmallestOf3 {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        //get 3 input number
        System.out.println("enter 3 number :");
        int number1= sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        //checking  if first is the smallest of three number  
        if(number1<number2&& number1<number3){
            System.out.println("Is the first number the smallest? YES");
        }else{
            System.out.println("Is the first number the smallest? NO");
        }
        sc.close();
    }
}
