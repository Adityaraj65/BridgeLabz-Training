package multi_threading.thread_state_monitoring_system;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StateMonitor implements Runnable{
    private Thread t1,t2;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    public StateMonitor(Thread t1,Thread t2){
        this.t1=t1;
        this.t2=t2;
    }
    public void run(){
        while(t1.getState()!=Thread.State.TERMINATED||t2.getState()!=Thread.State.TERMINATED){
            displayState(t1);
            displayState(t2);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        displayState(t1);
        displayState(t2);
        System.out.println("\nSummary tasks completed");
    }
    private void displayState(Thread t){
        System.out.println("[Monitor]"+t.getName()+ " is in " + t.getState() + " state at " + LocalTime.now().format(dtf));
    }
}
