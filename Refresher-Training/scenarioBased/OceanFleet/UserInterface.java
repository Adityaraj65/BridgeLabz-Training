package scenarioBased.OceanFleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		VesselUtil vu=new VesselUtil();
		for(int i=0;i<n;i++) {
			
			String detail=sc.nextLine();
			
			String[] arr=detail.split(":");
			String vesselId=arr[0];
			String vesselName=arr[1];
			double averageSpeed=Double.parseDouble(arr[2]);
			String vesselType=arr[3];
			Vessel v=new Vessel(vesselId , vesselName  ,averageSpeed ,vesselType);
			
			vu.addVesselPerformance(v);
			
		}
		System.out.println("Enter the vesselId to checkSpeed");
		String searchId=sc.nextLine();
			Vessel vessel=vu.getVesseById(searchId);
			if(vessel!=null){
				System.out.println(
				        vessel.getVesselId() + " | " +
				        vessel.getVesselName() + " | " +
				        vessel.getVesselType() + " | " +
				        vessel.getAverageSpeed() + " knots"
				    );}else {
				    	 System.out.println("Vessel Id " + searchId + " not found");
			}
			
			List<Vessel>vesselList=vu.getHighPerformanceVessels();
			for(int j=0;j<vesselList.size();j++) {
				System.out.println("high performance vesse are\n"+vesselList.get(j).getVesselId()+"|"+vesselList.get(j).getVesselName()+"|"+
						vesselList.get(j).getVesselType() +"|"+vesselList.get(j).getAverageSpeed()+"knots");
			}
			
		
		
    }
}
