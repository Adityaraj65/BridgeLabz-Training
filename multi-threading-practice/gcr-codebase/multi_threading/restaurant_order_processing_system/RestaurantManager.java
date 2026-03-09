package multi_threading.restaurant_order_processing_system;

public class RestaurantManager {
    public static void main(String[] args) {
        Thread t1=new Thread(new Chef("chef-1","Pizza",3.0));
        Thread t2=new Thread(new Chef("chef-2","pasta",2.0));
        Thread t3 = new Thread(new Chef("Chef-3", "Salad", 1.0));
        Thread t4 = new Thread(new Chef("Chef-4", "Burger", 2.5));

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            // Task 5: Use join() to ensure manager waits for everyone
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Task 6: Final status
        System.out.println("\nKitchen closed - All orders completed");
    }
}
