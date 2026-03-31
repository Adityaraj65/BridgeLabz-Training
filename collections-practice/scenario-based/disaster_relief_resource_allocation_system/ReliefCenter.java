package disaster_relief_resource_allocation_system;

import java.util.HashMap;
import java.util.Map;

/*
 * ReliefCenter represents a physical center
 * Each center maintains its own resources
 */
public class ReliefCenter {

    private String id;
    private String location;

    // Resource inventory of this relief center
    private Map<String, Integer> resources = new HashMap<>();

    public ReliefCenter(String id, String location) {
        this.id = id;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    // Add resource to this center
    public void addResource(String item, int quantity) {
        item = item.toLowerCase();

        // getOrDefault avoids null check
        resources.put(item, resources.getOrDefault(item, 0) + quantity);
    }

    // Check if center can fulfill request
    public boolean hasSufficientResource(String item, int quantity) {
        return resources.getOrDefault(item, 0) >= quantity;
    }

    // Allocate resource
    public void allocateResource(String item, int quantity) {
        resources.put(item, resources.get(item) - quantity);
    }

    // For report
    public Map<String, Integer> getResources() {
        return resources;
    }
}
