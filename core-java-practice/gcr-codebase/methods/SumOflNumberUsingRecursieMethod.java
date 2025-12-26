import java.util.Scanner;
public class SumOflNumberUsingRecursieMethod {
    public static void main(String[] args) {
        // create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");

        int n=sc.nextInt();
        int number;
        // checking if input number is valid natural number
        if(n<1){
            System.out.println("Enter a valid natural number");
            number=sc.nextInt();
        }
        else{
            number=n;
        }
        // get sum of n natural number using recursive method
        int usingRecurvieMethod=sumUsingRecursiveMethod(number);
          // get sum of n natural number using formula
        int usingFormula=SumOfNNaturalNumberUsingFormula(number);
        //comparing both computation
        if(usingFormula==usingRecurvieMethod){
            System.out.println("Both computation is same "+usingFormula);
        }else{
            System.out.println("Both computation are different using formula is "
            +usingFormula+" and using recursive method is "+usingRecurvieMethod);
        }

    }
    // method to calculate sum of n number using recursive method
    public static int sumUsingRecursiveMethod(int number){
        int sum=0;
        if(number==0){
            return 0;
        }else{
            return number+sumUsingRecursiveMethod(number-1);
        }
    }
    // method to calculate sum of n number using formula
    public static int SumOfNNaturalNumberUsingFormula(int n){
        int sum=n*(n+1)/2;
        return sum;
    }

}
