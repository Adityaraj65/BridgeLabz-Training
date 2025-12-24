import java.util.Scanner;
public class MaximumNumberOfHandshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // get input number of student 
        System.out.println("Enter the number of student:");
        int numberOfStudent=sc.nextInt();
        int maximumHandshake=possibleHandshake(numberOfStudent);
        System.out.println("the number of possible handshake  "+maximumHandshake);
        sc.close();

    }
    static int possibleHandshake(int n){
        int combination =(n*(n-1))/2;
        return combination;
    }
    
    
}
