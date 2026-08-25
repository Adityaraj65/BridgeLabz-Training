package questionBank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostCommonWordLength {
	public static void maximumOccuringWord(String s) {
		HashMap<String,Integer>map=new HashMap<>();
		String[] str=s.split(" ");
		for(String c:str) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		int maximum=0;
		String maxString="";
		for(Map.Entry<String, Integer> m:map.entrySet()) {
			if(m.getValue()>maximum) {
				maximum=m.getValue();
				maxString=m.getKey();
				
			}
				
		}
		System.out.println(maxString);
	
		System.out.println(maxString.length());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		maximumOccuringWord(str);
	}
}
