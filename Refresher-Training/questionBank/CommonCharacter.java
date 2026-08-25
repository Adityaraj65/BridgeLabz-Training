package questionBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonCharacter {
	public static void main(String[] args) {
		ArrayList<String>list1=new ArrayList<>();
		ArrayList<String>list2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter element for list1");
			String str1=sc.next();
			list1.add(str1);
			System.out.println("enter element for list2");
			String str2=sc.next();
			list2.add(str2);
		}
		List<String> result=commonCharacterCheck(list1,list2);
		for(String s:result) {
			System.out.print(s+" ");
		}
	}
	public static List<String> commonCharacterCheck(List<String> l1 ,List<String> l2){
		List<String>resultList=new ArrayList<String>();
		for(int i=0;i<l1.size();i++) {
			if(commonCharacterExist(l1.get(i),l2.get(i))) {
				resultList.add("YES");
			}else {
				resultList.add("NO");
			}
		}
		return resultList;
	}
	public static boolean commonCharacterExist(String s1,String s2) {
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
