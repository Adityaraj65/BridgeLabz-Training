package ecommerce;

import java.util.ArrayList;

//class InvalidPriceException extends Exception{
//    public InvalidPriceException(String msg){
//        super(msg);
//    }
//}
public class Product {
    private int productId;
    private String productName;
    private double price;
    boolean isAvailable;
    public Product(int productId,String productName,double price){
        this.productId=productId;
        this.productName=productName;
        setPrice(price);
        this.isAvailable=true;
    }
    public int getProductId(){
        return productId;
    }
    // set product name
    public void setProductName(String name){
        this.productName=name;
    }
    public String getProductName(){
        return productName;
    }
    //set price
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("price cannot be negative ");
            return;
        }
        this.price = price;
    }
    //get price
    public double getPrice(){
        return price;
    }

    public void SetAvailabilityStatus(){
        this.isAvailable=false;
    }
}
