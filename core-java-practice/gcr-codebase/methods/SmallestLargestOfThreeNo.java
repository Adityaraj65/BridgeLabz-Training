import java.util.Scanner;
public class SmallestLargestOfThreeNo {
    public static void main(String[] args) {
        // create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int number1=sc.nextInt();
        System.out.println("Enter second number");
        int number2= sc.nextInt();
        System.out.println("Enter third number");
        int number3= sc.nextInt();
        int[] result=findSmallestAndLargest(number1,number2,number3);
        System.out.println("The Largest of three number is "+result[0]);
        System.out.println("The smallest of three number is "+result[1]);

    }
    //method to find smallest and largest
    public static int[] findSmallestAndLargest(int number1,int number2,int number3){
        int largest;
        int smallest;
        // finding largest
        if(number1>number2&&number1>number3){
            largest=number1;
        }
        else if(number2>number1 && number2>number3){
            largest=number2;
        }else{
            largest=number3;
        }
        // finding the smallest
        if(number1<number2&&number1<number3){
            smallest=number1;
        }
        else if(number2<number1 && number2<number3){
            smallest=number2;
        }else{
            smallest=number3;
        }
        return new int[]{largest,smallest};
    }

}
