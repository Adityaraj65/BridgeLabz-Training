package multi_threading.thread_state_monitoring_system;

public class TaskRunner implements Runnable {
    @Override
    public void run(){
        try{
            double sum=0;
            for(int i=0;i<100000;i++){
                sum+=Math.sqrt(i);
            }
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.err.println(Thread.currentThread().getName()+"Interrupted");
        }
    }

}
