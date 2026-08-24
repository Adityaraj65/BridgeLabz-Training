package scenarioBased.OceanFleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
private List<Vessel> vesselList=new ArrayList<>();
public void addVesselPerformance(Vessel vessel) {
	vesselList.add(vessel);
}
public Vessel getVesseById(String vesselId) {
	for(int i=0;i<vesselList.size();i++) {
		if(vesselList.get(i).getVesselId().equals(vesselId)) {
			return vesselList.get(i);
		}
	}
	return null;
}
public List<Vessel>getHighPerformanceVessels(){
	double highestspeed=vesselList.get(0).getAverageSpeed();
	for(int i=1;i<vesselList.size();i++) {
		if(vesselList.get(i).getAverageSpeed()>highestspeed) {
			highestspeed=vesselList.get(i).getAverageSpeed();
		}
	}
	List<Vessel>list=new ArrayList<Vessel>();
	for(int i=0;i<vesselList.size();i++) {
		if(vesselList.get(i).getAverageSpeed()==highestspeed) {
			list.add(vesselList.get(i));
		}
	}
	return list;
}


}
