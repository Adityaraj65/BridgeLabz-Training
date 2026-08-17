package day8;

import java.util.ArrayList;

public class PermutationOfString {
	public static ArrayList<String> getPermutation(String str){
		if(str.length()==0) {
			ArrayList<String>br=new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String>mr=new ArrayList<String>();
		ArrayList<String>rr=getPermutation(ros);
		for(String rrs:rr) {
			for(int i=0;i<=rrs.length();i++) {
				String val=rrs.substring(0,i)+ch+rrs.substring(i);
				mr.add(val);
			}
			
		}
		return mr;
		
		
	}
	public static void main(String[] args) {
		String s="ABC";
		ArrayList<String >list=getPermutation(s);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}
}
