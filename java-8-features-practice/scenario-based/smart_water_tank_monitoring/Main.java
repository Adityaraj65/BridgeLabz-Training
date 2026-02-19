package smart_water_tank_monitoring;

public class Main {
    public static void main(String[] args) {
        WaterTankUtil w=new WaterTankUtil();
        WaterTank wt=new WaterTank(100,1000,100);
        WaterTank wt1=new WaterTank(101,500,80);
        WaterTank wt2=new WaterTank(102,1050,70);
        WaterTank wt3=new WaterTank(103,1500,85);
        w.addTank(wt);
        w.addTank(wt1);
        w.addTank(wt3);
        w.addTank(wt2);
        w.waterTankUsed(100,250);
        w.sortTank();
        w.addWater(100,100);

    }
}
