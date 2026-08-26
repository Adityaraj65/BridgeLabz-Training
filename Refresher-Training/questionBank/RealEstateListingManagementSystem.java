package questionBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Property{
	String location;
	int price;
	int id;
	public Property(String location,int price,int id) {
		this.location=location;
		this.price=price;
		this.id=id;
	}
	public String getLocation() {
		return location;
	}
	public int getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setLocation(String location) {
		this.location=location;
	}
}
class PropertyUtil{
	static List<Property>propertiesList=new ArrayList<Property>();
	public static void addListing(Property p) {
		propertiesList.add(p);
		System.out.println("listing added");
		
	}
	public static void removeListing(int id) {
		for(int i=0;i<propertiesList.size();i++) {
			if(propertiesList.get(i).getId()==id) {
				propertiesList.remove(i);
				System.out.println("properties listing removed");
			}
		}
	}
	public static void updateList(int price,int id,String location) {
		for(int i=0;i<propertiesList.size();i++) {
			if(propertiesList.get(i).getId()==id) {
				propertiesList.get(i).setPrice(price);
				propertiesList.get(i).setLocation(location);
				System.out.println("properties listing prices and location updated ");
			}
		}
	}
}
public class RealEstateListingManagementSystem {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter price");
			int price=sc.nextInt();
			System.out.println("enter location");
			String location=sc.nextLine();
			Property p=new Property(location, price, id);
			
			PropertyUtil.addListing(p);
		}
		PropertyUtil.removeListing(1);
		PropertyUtil.updateList(10000000, 2, "mathura");
		
		
		
    }
}
