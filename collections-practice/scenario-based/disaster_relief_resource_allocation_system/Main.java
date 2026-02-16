package disaster_relief_resource_allocation_system;
public class Main {

    public static void main(String[] args) {

        ReliefCentersUtil util = new ReliefCentersUtil();

        // Create relief centers
        ReliefCenter delhi = new ReliefCenter("RC1", "Delhi");
        ReliefCenter mumbai = new ReliefCenter("RC2", "Mumbai");

        // Add resources to centers
        delhi.addResource("food", 100);
        delhi.addResource("water", 50);

        mumbai.addResource("food", 40);
        mumbai.addResource("medical", 30);

        // Register centers
        util.addReliefCenter(delhi);
        util.addReliefCenter(mumbai);

        // Add affected area requests (FIFO)
        util.addAffectedAreaRequest(new AreaRequest("Area A", "food", 30));
        util.addAffectedAreaRequest(new AreaRequest("Area B", "medical", 20));
        util.addAffectedAreaRequest(new AreaRequest("Area C", "water", 40));

        try {
            util.allocateResources();
            util.generateReport();
        } catch (InsufficientResourceException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

