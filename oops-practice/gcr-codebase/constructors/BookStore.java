public class BookStore {

	public static void main(String[] args) {
		Books b1=new Books();
		Books b2=new Books("Fake Nationalism","Aditya Raj",1000.0);
		b1.displayDetails();
		b2.displayDetails();

	}

}
class Books{
	String title;
	String author;
	double price;
	//Default constructor
	Books(){
		title="unknown title";
		author="author";
		price=0.0;
	}
	
	//parameterized constructor
	Books(String title , String author,double price) {
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	//method to display book details
	void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
        System.out.println();
    }
}
