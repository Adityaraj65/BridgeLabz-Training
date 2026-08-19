package day14;

import java.util.Scanner;
abstract class Book1{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}
class MyBook1 extends Book1{
    @Override
	void setTitle(String s){
        this.title=s;
    }
    
}
//Write MyBook class here

public class JavaAbstractClass{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook1 new_novel=new MyBook1();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}
