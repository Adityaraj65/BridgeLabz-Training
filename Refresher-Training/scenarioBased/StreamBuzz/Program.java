package scenarioBased.StreamBuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static List<CreatorStats> EngagementBoard=new ArrayList();
	public void RegisterCreator(CreatorStats record) {
		EngagementBoard.add(record);
		System.out.println("Creator register successfully");
	}
	public HashMap<String,Integer> getTopPostCounts(List<CreatorStats> records,double likeThreshold){
		
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		for(int i=0;i<records.size();i++) {
			int count=0;
			double weeklyLike[]=records.get(i).getWeeklyLike();
			for(int j=0;j<weeklyLike.length;j++) {
				if(weeklyLike[j]>=likeThreshold) {
					count++;
				}
			}
			map.put(records.get(i).getName(),count);
		}
		return map;
		
	}
	public double CalculateAverageLikes() {
		double total=0;
		for(int i=0;i<EngagementBoard.size();i++) {
			total+=EngagementBoard.get(i).getAverageWeeklyLike();
		}
		return total/EngagementBoard.size();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Program p=new Program();
		boolean flag=true;
		while(flag){
			System.out.println("1. Register Creator \n"
					+ "2. Show Top Posts\n"
					+ "3. Calculate Average Likes\n"
					+ "4. Exit");
		
		System.out.println("enter you choice");
		int n=sc.nextInt();
		if(n==4) {
			System.out.println("Logging off- Keep Creating with StreamBuzz");
			flag=false;
		}else if(n==1) {
			System.out.println("enter creator name");
			String str=sc.next();
			System.out.println("enter weekly likes");
			double[] weeklyLike=new double[4];
			for(int k=0;k<4;k++) {
				weeklyLike[k]=sc.nextDouble();
			}
			
			CreatorStats cs=new CreatorStats(str, weeklyLike);
			p.RegisterCreator(cs);
			
		}else if(n==3) {
			System.out.println("Overall average weekly likes: "+p.CalculateAverageLikes());
		}
		else if(n==2) {
			System.out.println("enter threshold");
			double likeThreshold=sc.nextDouble();
			HashMap<String,Integer> mapResult=p.getTopPostCounts(EngagementBoard, likeThreshold);
			for(Map.Entry<String,Integer> m: mapResult.entrySet()) {
				System.out.println(m.getKey()+"-"+m.getValue());
			}
		}
		}
		
			
	}
	
}
