import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        
        while (true) {
            System.out.print("Enter your lucky number: ");
            int number = sc.nextInt();
            // if number enterend is <=0 then asking user to enter valid number 
            if (number <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                continue;
            }
            // if number is divisible by both 3 and 5 then they won a gift 
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift 🎁");
            } else {
                System.out.println("Sorry, better luck next time.");
            }
           // asking if there is another visitor 
            System.out.print("Is there another visitor? (yes/no): ");
            choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Lucky draw closed. Happy Diwali!");
                break;
            }
        }
    }
}
