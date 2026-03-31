package ocean_fleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtilClass {
    private List<Vessel> vesselList=new ArrayList<>();
    public void addVesselPerformance(Vessel vessel){
        vesselList.add(vessel);
    }
    public Vessel getVesselById(String vesselId){
        for(Vessel v:vesselList){
            if(v.getVesselId().equals(vesselId)){
                return v;
            }
        }
        return null;
    }
    public List<Vessel>getHighPerformanceVessels(){
        List<Vessel>highPerformanceVessel=new ArrayList<>();
        double highestSpeed=0;
        for(Vessel v: vesselList){
            if(v.getAverageSpeed()>=highestSpeed){
                highestSpeed=v.getAverageSpeed();
            }
        }
        for(Vessel v: vesselList){
            if(v.getAverageSpeed()==highestSpeed){
                highPerformanceVessel.add(v);
            }
        }
        return highPerformanceVessel;
    }
}
