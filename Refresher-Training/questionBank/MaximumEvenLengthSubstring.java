package questionBank;

public class MaximumEvenLengthSubstring {
	public static void main(String[] args) {
		String str="hello";
		if(str.length()%2==0) {
			System.out.println(str.substring(0));
		}else if(str.length()%2!=0) {
			System.out.println(str.substring(1));
			System.out.println(str.substring(0,str.length()-1));
		}
	}
}
