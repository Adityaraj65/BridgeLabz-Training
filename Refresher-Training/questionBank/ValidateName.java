package questionBank;

import java.util.Scanner;

class InvalidNameException extends Exception{
	public InvalidNameException(String msg) {
		super(msg);
	}
}
public class ValidateName {
	public static boolean validate(String name) {
		return name!=null&&!name.trim().isEmpty()&&name.matches("[A-Za-z]+( [A-Za-z]+)?");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		String name=sc.nextLine();
		try{
			if(validate(name)) {
		
			System.out.println("valid");
		}else {
			throw new InvalidNameException("Invalid Name");
		}
		}catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
	}}
}
