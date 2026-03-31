package smart_water_tank_monitoring;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WaterTankUtil {
    List<WaterTank> list=new ArrayList<>();
    public void sortTank(){
        List<WaterTank>sortedTank=list.stream().sorted(Comparator.comparing(WaterTank::getCapacity)).collect(Collectors.toList());
        for(WaterTank i: sortedTank){
            System.out.println(i.getId());
            System.out.println(i.getCurrentWater());
            System.out.println(i.getCapacity());
            System.out.println(i.getCurrentLevel());
            System.out.println("==========================");
        }
    }
    public void addTank(WaterTank w){

        list.add(w);
        w.calculateCurrentWater();

        System.out.println("water tank added successfully");
    }
    public void addWater(int tankId,double amount){
        for(WaterTank w: list){
            if(w.getId()==tankId){
                w.calculateCurrentWater();
                try{
                    w.addWater(amount);
                    System.out.println("water added successfully");
                    System.out.println("tank id :"+w.getId()+"level :"+w.getCurrentLevel());
                }catch(InvalidWaterLevelException e){
                    System.out.println(e.getMessage());

                }

            }
        }
    }
    public void waterTankUsed(int tankId,double amountUsed){
        for(WaterTank w: list){

            if(w.getId()==tankId){
                w.calculateCurrentWater();
                if(w.getCurrentWater()<amountUsed){
                    System.out.println("warning : not enough water in tank");
                    return;
                }else{
                    w.calculateUsagePercentage(amountUsed);
                    if(w.getCurrentLevel()<20){
                        System.out.println("warning water level is below 20 kindly refuel");
                    }
                    System.out.println("tank id : "+w.getId()+"current level in percentage :"+ w.getCurrentLevel());
                }


            }

        }

    }

}
