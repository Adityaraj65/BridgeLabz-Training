import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initial smart card balance
        double balance = 10000.0;

        while (true) {

            // display current balance
            System.out.println("\nCurrent balance is : ₹" + balance);

            // get distance input
            System.out.println("Enter distance travelled in km (enter -1 to exit)");
            double distance = sc.nextDouble();

            // exit condition
            if (distance == -1) {
                break;
            }

            // calculate fare using ternary operator
            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 40 : 60;

            // check if sufficient balance is available
            if (balance >= fare) {
                balance = balance - fare;
                System.out.println("Fare deducted : ₹" + fare);
            } else {
                System.out.println("Insufficient balance");
                break;
            }

            // stop if balance is exhausted
            if (balance <= 0) {
                System.out.println("Balance exhausted");
                break;
            }
        }

        // final balance
        System.out.println("\nFinal balance is : ₹" + balance);

        sc.close();
    }
}

