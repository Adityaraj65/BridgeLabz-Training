import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitprice=sc.nextInt();
        int quantity=sc.nextInt();
        int totalPrice=unitprice*quantity;
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitprice);
    }
}
