package multi_threading.restaurant_order_processing_system;

public class Chef implements Runnable{
    private String chefName;
    private String dish;
    private double totalTime;
    public Chef(String chefName,String dish,double totalTime){
        this.chefName=chefName;
        this.totalTime=totalTime*1000;
        this.dish=dish;
    }
    @Override
    public void run(){
        System.out.println(chefName+"Started preparing"+dish);
        try{
            double interval=totalTime/4;
            for(int i=0;i<=4;i++){
                Thread.sleep((long) interval);
                System.out.println(chefName+"preparing"+dish+":"+(i*25)+"%");
            }
            System.out.println(chefName+"finished"+dish);
        }catch(InterruptedException e){
            System.out.println(chefName+"was interrupted");
        }
    }



}
