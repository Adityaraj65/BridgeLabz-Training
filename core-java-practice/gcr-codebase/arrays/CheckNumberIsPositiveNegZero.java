
import java.util.Scanner;
public class CheckNumberIsPositiveNegZero {
	public static void main(String[] args) {
		
		// creating scanner as object 
        Scanner sc= new Scanner(System.in);
        //created an array to store 5 numbers
        int [] numbers=new int[5];
        System.out.println("enter 5 numbers ");
        for(int i=0;i<5;i++){
        	numbers[i]=sc.nextInt();

        }
        //checking if number is positive negative or zero 
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
            	if(numbers[i]%2==0) {
            		System.out.println("Numbers "+numbers[i]+" is positive and even ");
            	}else {
            		System.out.println("number "+numbers[i]+" is positive and odd");
            	}
                
            }else if(numbers[i]<0){
                System.out.println("numbers "+numbers[i]+" is negative");
                
            }else{
                System.out.println("numbers "+numbers[i]+" is zero");
            }
            
        }
        //comparing first and last number if they equal greater or less 
        if(numbers[0]>numbers[numbers.length-1]) {
        	System.out.println("first number is greater than last number ");
        }else if(numbers[0]<numbers[numbers.length-1]) {
        	System.out.println("first number is less than last number ");
        }else {
        	System.out.println("first and last number are equal");
        }
        sc.close();
	}

}
