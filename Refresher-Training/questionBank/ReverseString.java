package questionBank;
class InvalidInputException extends Exception{
	public InvalidInputException(String msg) {
		super(msg);
	}
}
public class ReverseString {
	public static void reverseString(String str) {
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse().toString());
		
		
		
	}
 public static void main(String[] args) {
	 String str="45";
	 try {
		 if(str.matches("[0-9]+")) {
			 throw new InvalidInputException("Invalid Input");
		 }else {
			 reverseString(str);
		 }
	 }catch(InvalidInputException e){
		 System.out.println(e.getMessage());
	 }
	
}
}
