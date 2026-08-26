package questionBank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountSpecialStringRangeQueries {

    public static List<Integer> countSpecialStrings(List<String> arr,List<String> queries) {
        List<Integer> list=new ArrayList<Integer>();
    	for(int i=0;i<queries.size();i++) {
        	String q1=queries.get(i);
        	String[] qarr=q1.split("-");
        	int l=Integer.parseInt(qarr[0]);
        	int r=Integer.parseInt(qarr[1]);
        	int count=0;
        	for(int j=l-1;j<r;j++) {
        		String str=arr.get(j);
        		if(isSpecial(str)) {
        			count++;
        		}
        	}
        	list.add(count);
        	
        	
        	
        }
    	return list;
			
    }

    public static boolean isSpecial(String s) {
        char firstChar=s.charAt(0);
        char lastChar=s.charAt(s.length()-1);
        if(isVowel(firstChar)&&isVowel(lastChar)) {
        	return true;
        }else {
			return false;
		}
    }
    public static boolean isVowel(char c) {
    	return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
        		c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }

        // Number of queries
        int m = sc.nextInt();

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            queries.add(sc.next());
        }

        List<Integer> result = countSpecialStrings(arr, queries);

        System.out.println(result);

        sc.close();
    }
}