package disaster_relief_resource_allocation_system;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
public class ReliefCentersUtil {
    private Map<String ,ReliefCenter>reliefCenters=new HashMap<>();
    private Queue<AreaRequest>affectedAreas=new ArrayDeque<>();
    public void addReliefCenter(ReliefCenter r){
        if(reliefCenters.containsKey(r.getId())){
            System.out.println("relief center data is already present");
        }
        reliefCenters.put(r.getId(),r);
    }
    public void addAffectedAreaRequest(AreaRequest request){
        affectedAreas.offer(request);
    }    // Allocate resources FIFO
    public void allocateResources() throws InsufficientResourceException {

        while (!affectedAreas.isEmpty()) {

            AreaRequest request = affectedAreas.poll(); // FIFO removal
            boolean allocated = false;

            // Try allocating from any available relief center
            for (ReliefCenter center : reliefCenters.values()) {

                if (center.hasSufficientResource(
                        request.getRequirement(),
                        request.getQuantity())) {

                    center.allocateResource(
                            request.getRequirement(),
                            request.getQuantity());

                    request.markReliefReceived();

                    System.out.println(
                            "Allocated " + request.getQuantity() + " "
                                    + request.getRequirement() + " to "
                                    + request.getLocation()
                                    + " from center " + center.getLocation()
                    );

                    allocated = true;
                    break;
                }
            }

            // If no center could fulfill request
            if (!allocated) {
                throw new InsufficientResourceException(
                        "Insufficient resources for area: "
                                + request.getLocation()
                );
            }
        }
    }

    // Generate final report
    public void generateReport() {

        System.out.println("\n------ FINAL RESOURCE REPORT ------");

        for (ReliefCenter center : reliefCenters.values()) {
            System.out.println("Relief Center: " + center.getLocation());
            for (Map.Entry<String, Integer> entry : center.getResources().entrySet()) {
                System.out.println("  " + entry.getKey() + " remaining: " + entry.getValue());
            }
        }
    }
}
