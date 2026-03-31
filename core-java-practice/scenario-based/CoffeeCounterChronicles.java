import java.util.*;
public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double gstRate=0.05;
        while(true){
             // Display coffee menu
            System.out.println("Please choose your coffee:");
            System.out.println("1. Espresso      - ₹100");
            System.out.println("2. Latte         - ₹130");
            System.out.println("3. Cappuccino    - ₹180");
            System.out.println("4. Americano     - ₹170");
            System.out.println("6. Mocha         - ₹160");
            System.out.println("7. Iced coffee   - ₹80");
            System.out.println("8. nescafee      - ₹30");
            System.out.println("9. Filter coffee - ₹50\n");
            
            System.out.println("Type the coffee name to order");
            System.out.println("(or type 'exit' to close the café):\n");
            //enter cofee want to order
            String coffeeType=sc.nextLine().toLowerCase();
            //exit condition
            if(coffeeType.equals("exit")){
                System.out.println("cafe close . thanku!");
                break;

            }
            //ask for quantity
            System.out.println("Enter quantity");
            int quantity=sc.nextInt();

            double pricePercup;
            
            // Switch case for coffee selection
            switch(coffeeType){
                case "espresso":
                    pricePercup=100;
                    break;
                case "latte":
                    pricePercup=130;
                    break;
                case "cappuccino":
                    pricePercup=180;
                    break;
                case "americano":
                    pricePercup=170;
                    break;
                case "mocha":
                    pricePercup=160;
                    break;  
                case "iced coffee":
                    pricePercup=80;
                    break;  
                case "nescafe":
                    pricePercup=30;
                    break;
                case "filter coffee":
                    pricePercup=50;
                    break;
                default:
                    System.out.println("Sorry this type  of coffee is not available . \n");   
                    continue;             

            }
              // Bill calculation
            double totalAmount=pricePercup*quantity;
            double gstAmount=totalAmount*gstRate;
            double finalBill=totalAmount+gstAmount;
           
            // Display bill
            System.out.println("Total Amount: ₹" + totalAmount);
            System.out.println("GST (5%): ₹" + gstAmount);
            System.out.println("Final Bill: ₹" + finalBill);
            System.out.println("----------------------------\n");

        }
        sc.close();
    }
}
