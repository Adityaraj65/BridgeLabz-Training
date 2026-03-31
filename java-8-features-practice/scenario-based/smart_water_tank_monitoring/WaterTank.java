package smart_water_tank_monitoring;

public class WaterTank {
    private int id;
    private double capacity;
    private double currentLevel;
    private double currentWater;
    public WaterTank(int id,double capacity,double currentLevel){
        this.id=id;
        this.currentLevel=currentLevel;
        this.capacity=capacity;

    }
    public int getId(){
        return this.id;
    }
    public double getCapacity(){
        return this.capacity;

    }
    public void calculateCurrentWater(){
        currentWater=(currentLevel * capacity) /100;;
    }
    public void addWater(double amount) throws InvalidWaterLevelException{
        if(currentWater+amount>capacity){
            throw new InvalidWaterLevelException("water level exceed current capacity");
        }else{
            currentWater+=amount;
            currentLevel=(currentWater/capacity)/100;
        }

    }
    public double getCurrentLevel(){
        return this.currentLevel;
    }
    public double getCurrentWater(){
        return currentWater;
    }
    public void calculateUsagePercentage(double amountUsage){
        currentWater-=amountUsage;
        currentLevel=(currentWater/capacity)*100;
    }

}
