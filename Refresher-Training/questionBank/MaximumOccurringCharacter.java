package questionBank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccurringCharacter {
	public static void maximumOccuringChar(String s) {
		HashMap<Character,Integer>map=new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		int maximum=0;
		char maxChar=0;
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			if(m.getValue()>maximum) {
				maximum=m.getValue();
				maxChar=m.getKey();
			}
				
		}
		System.out.println(maxChar);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		maximumOccuringChar(str);
	}
}
