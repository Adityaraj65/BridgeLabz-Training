import java.util.Scanner;
public class FactorOfNumber {
    public static void main(String[] args) {
        // create scanner object
        Scanner sc= new Scanner(System.in);
        // get input number
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        // get factors of input number 
        int[] numberFactor=factors(number);
        System.out.println("Factors of input number are :");
        for(int i=0;i<numberFactor.length;i++){
            //printing the factors of number
            System.out.print(numberFactor[i]+", ");
        }
        System.out.println();

        // get sum of factors
        int sumOfFactorResult=sumOfFactor(numberFactor);
        System.out.println("The sum of factors is :"+sumOfFactorResult);

        //get product of factor
        int productOfFactorResult=productOfFactor(numberFactor);
        System.out.println("The product of factors is: "+productOfFactorResult);
        //get sum of square of the factor

        int sumOfSquareOfFactorResult=sumOfSquareOfFactor(numberFactor);
        System.out.println("the sum of square of the factors is "+sumOfSquareOfFactorResult);
        sc.close();
    }
    //method to find the factors
    public static int[] factors(int number){
        int i=1;
        int count=0;
        //loop to find the count
        while(i<=number){
            if(number%i==0){
                count++;
                i++;
            }else{
                i++;
            }
           
        }
        int[] arr= new int[count];
        int j=1;
        int k=0;
        //loop to find factor
        while(j<=number){
            if(number%j==0){
                arr[k]=j;
                k++;
                j++;
            }else{
                j++;
            
            }
        }
        return arr;
    }
    //method to find sum of factor
    public static int sumOfFactor(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i];
        }
        return sum;
    }
    //method to find the product of factor
    public static int productOfFactor(int[] factors){
        int product=1;
        for(int i=0;i<factors.length;i++){
            product*=factors[i];
        }
        return product;
    }
    // method to find the sum of square of factor
    public static int sumOfSquareOfFactor(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=Math.pow(factors[i], 2);
        }
        return sum;
    }

}
