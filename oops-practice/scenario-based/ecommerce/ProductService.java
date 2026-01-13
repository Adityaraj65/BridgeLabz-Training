package ecommerce;

import java.util.ArrayList;

public class ProductService {

    ArrayList<Product> products=new ArrayList<>();
    // add product
    public void addProduct(Product s){
        products.add(s);
        return;
    }
    public void deleteProduct(int id ){
        if(products.size()==0){
            System.out.println("No product available to delete");
            return;
        }for(int i=0;i<products.size();i++){
            if(products.get(i).getProductId()==id){
                products.remove(i);
                return;
            }
        }
        System.out.println("no such product avaialble");

    }
    public void displayAllProduct(){
        for(Product p:products){
            System.out.println("Product Id :"+ p.getProductId());
            System.out.println("product name : "+p.getProductName());
            System.out.println("product price : " +p.getPrice());
            System.out.println("------------------------------------");
        }

    }
}
