package questionBank;

public class MinmReplacementForValidAdjacentChar {
	public static void main(String[] args) {
		String str="caaab";
		System.out.println(minimumReplacement(str));
	}
	static boolean invalid(char a,char b) {
		return a==b||Math.abs(a-b)==1;
	}
	static int minimumReplacement(String s) {
		char[] arr=s.toCharArray();
		int count=0;
		for(int i=1;i<arr.length;i++) {
			if(!invalid(arr[i-1],arr[i])) {
				continue;
			}
			for(char c='a';c<='z';c++) {
				if(invalid(arr[i-1],c)) {
					continue;
				}
				if(i+1<arr.length&&invalid(c,arr[i+1])) {
					continue;
				}
				arr[i]=c;
				count++;
				break;
			}
		}
		return count;
	}
}
	
