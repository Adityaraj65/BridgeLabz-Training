import java.util.Scanner;

public class PositiveNegativeEvenOddChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];
        // loop to get input from user
        for(int i=0;i<5;i++){
            System.out.println("Enter number : "+(i+1));
            //get input numbers
            numbers[i]=sc.nextInt();
            //check if number is positive or not
            boolean isNoPositive=isPositive(numbers[i]);
            // if positive then check is it even or odd
            if (isNoPositive) {
                boolean isNoEven=isEven(numbers[i]);
                if(isNoEven){
                    System.out.println("Input number "+ numbers[i]+" is positive and even");
                }else{
                    System.out.println("Input number "+ numbers[i]+" is positive and odd");
                }
                
            }else{
                System.out.println("input number "+numbers[i]+" is negative");
            }
        }
        // this is just for adding nextline
        System.out.println();
        // comparing first and last element 
        int compareResult=compare(numbers);
        if(compareResult==1){
            System.out.println("first element greater than last element");
        }else if(compareResult==0){
            System.out.println("first element equal to last element");
        }else{
            System.out.println("first element less than  last element");
        }
        sc.close();


        
    }
    // method to check if number is positive 
    static boolean isPositive(int number){
        if(number<0){
            return false;
        }else{
            return true;
        }
    }
    // method to check if number is even or odd
    static  boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
    //comparing first and last element 
    static int  compare(int[] arr){
        if(arr[0]==arr[arr.length-1]){
            return 0;
        }else if(arr[0]<arr[arr.length-1]){
            return -1;
        }else{
            return 1;
        }
    }
}
