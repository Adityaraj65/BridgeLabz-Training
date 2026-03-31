package m1practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Product{
    String name;
    double price;
    int quantity;
    Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    double getValue(){
        return this.price*this.quantity;
    }
    public String getName(){
        return name;

    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    abstract void display();
}
class Electronics extends Product{

    int warranty;
    Electronics(String name,double price,int quantity,int warranty){
        super(name,price,quantity);
        this.warranty=warranty;
    }

    public int getWarranty(){
        return warranty;
    }
    void display(){
        System.out.println(name + " - Price: " + price + ", Quantity: " + quantity + ", Warranty: " + warranty + " months");
    }
}
class Clothing extends Product{

    String size;
    Clothing(String name, double price, int quantity, String size){
        super(name,price,quantity);
        this.size=size;
    }

    public String getSize(){
        return size;
    }
    void display(){
        System.out.println(name + " - Price: " + price + ", Quantity: " + quantity + ", Size: " + size);
    }
}
class Operation{
    static List<Product> list=new ArrayList<>();
    public  void addProduct(Product p){
        list.add(p);
        System.out.println("Product added to inventory: "+p.getName());
    }

    public void displayInventory(){
        System.out.println("Inventory:");
        for(Product p:list){
            p.display();

        }
    }
    public double calculateTotalValue(){
        double totalValue=0;
        for(Product p:list){
            totalValue+=p.getValue();
        }
        return totalValue;
    }
}

public class SupermarketStoreInventorySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Operation o=new Operation();
        for(int i=0;i<n;i++){
            String str=sc.nextLine().trim();
            String[] arr=str.split(",");
            String type=arr[0].trim();
            String name=arr[1].trim();
            double price=Double.parseDouble(arr[2].trim());
            int quantity=Integer.parseInt(arr[3].trim());
            if(type.equalsIgnoreCase("Electronics")){
                int warranty=Integer.parseInt(arr[4].trim());
                o.addProduct(new Electronics(name,price,quantity,warranty));
            }else{
                String size=arr[4].trim();
                o.addProduct(new Clothing(name,price,quantity,size));
            }
        }

        o.displayInventory();
        System.out.println("Total value of the inventory: "+o.calculateTotalValue());
    }
}
