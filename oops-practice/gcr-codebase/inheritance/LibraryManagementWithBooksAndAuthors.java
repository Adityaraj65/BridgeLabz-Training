package inheritance;

public class LibraryManagementWithBooksAndAuthors {
    public static void main(String[] args) {
        // Creating instance of Author
        Author author=new Author("Brown","2028","Aditya",24);
        author.displayInfo();
        
    }
}
// Base class
class Book{
    String title;
    String publicationYear;
    Book(String title,String publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    void displayDetails(){
        System.out.println("Title :"+title);
        System.out.println("publication year : "+publicationYear);
    }
}
// Derived classes
class Author extends Book{
    String name ;
    int age;
    Author(String title, String publicationYear,String name,int age) {
        super(title, publicationYear);
        this.name=name;
        this.age=age;
    }
    // Overriding displayDetails method
    public void displayInfo(){
        super.displayDetails();
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        

    }
}
