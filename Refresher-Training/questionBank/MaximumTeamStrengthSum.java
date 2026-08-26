package questionBank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumTeamStrengthSum {
	public static long getMaximumStrengthSum(List<Integer>empSkill,List<Integer>teamSize) {
		Collections.sort(teamSize);
		Collections.sort(empSkill,Collections.reverseOrder());
		int i=0;
		int j=0;
		long total=0;
		while(i<empSkill.size()) {
			int k=teamSize.get(j);
			int max=empSkill.get(i);
			int min=empSkill.get(i+(k-1));
			total+=min+max;
			i=i+k;
			j++;
			
		}
		return total;
	}
	public static void main(String[] args) {
		List<Integer> empSkill=new ArrayList<>();
		List<Integer>teamSize=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of empskill");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			empSkill.add(a);
		}
		System.out.println("enter size of team size");
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int b=sc.nextInt();
			teamSize.add(b);
		}
		System.out.println(getMaximumStrengthSum(empSkill,teamSize));
	}
}
