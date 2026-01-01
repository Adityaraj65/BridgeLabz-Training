
public class ProductInventory {

	public static void main(String[] args) {
		// Create Product objects
		 Product p1 = new Product("Laptop", 65000);
	     Product p2 = new Product("Bike", 300000);

	     p1.displayProductDetails();
	     p2.displayProductDetails();

	     Product.displayTotalProducts();

	}

}
class Product{
	String productName;
	int price;
	static int totalProduct=0;
	//parameterized constructor
	Product(String productName,int price){
		this.productName=productName;
		this.price=price;
		totalProduct++;
	}
	//method to display product details
	void displayProductDetails() {
		System.out.println("Product name : "+productName);
		System.out.println("Price : "+price);
		
		
	}
	//static method to display total products
	static void displayTotalProducts() {
		System.out.println("Total product in inventory : "+totalProduct);
	}
}