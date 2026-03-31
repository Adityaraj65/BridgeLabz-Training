import java.util.Scanner;
public class CheckNumberPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check if it is positive negative or zero");
        int number =sc.nextInt();
        int result=checkPositiveNegativeOrZero(number);
        System.out.println(" the number "+number +" is "+ result);
    }
    static int checkPositiveNegativeOrZero(int number){
        if(number<0){
            return -1;
        }else if(number>0){
            return 1;
        }else{
            return 0;
        }
    }
}
