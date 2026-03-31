package disaster_relief_resource_allocation_system;

/*
 * Represents an affected area request
 * Example: Area A needs 20 food kits
 */
public class AreaRequest {

    private String location;
    private String requirement;
    private int quantity;
    private boolean reliefReceived = false;

    public AreaRequest(String location, String requirement, int quantity) {
        this.location = location;
        this.requirement = requirement.toLowerCase(); // normalize key
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public String getRequirement() {
        return requirement;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isReliefReceived() {
        return reliefReceived;
    }

    public void markReliefReceived() {
        this.reliefReceived = true;
    }
}

