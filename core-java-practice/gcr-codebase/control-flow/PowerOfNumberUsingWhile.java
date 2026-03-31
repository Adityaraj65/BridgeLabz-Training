import java.util.Scanner;

public class PowerOfNumberUsingWhile {

    public static void main(String[] args) {
        //created scanner object
        Scanner sc = new Scanner(System.in);
        //get input number 
        System.out.println("enter a number ");
        int number = sc.nextInt();
        System.out.println("enter power value");
        int power = sc.nextInt();
        //create variable result with initial value 1
        int result = 1;
        int counter = 0;
        if(number>0 &&power>0){
            // Calculate power using while loop
            while (counter < power) {
            result = result * number;
            counter++;
            }
        }
        

        System.out.println(result);

        sc.close();
    }
}
