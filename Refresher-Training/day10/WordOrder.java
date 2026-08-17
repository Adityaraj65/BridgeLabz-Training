package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordOrder {
	public static void main(String[] args) {
		HashMap<String ,Integer>map=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String s=sc.next();
			map.put(s,map.getOrDefault(s, 0)+1);
		}
		System.out.println(map.size());
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    System.out.print(entry.getValue()+" ");
		}
    }
}
