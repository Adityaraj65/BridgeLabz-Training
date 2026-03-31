package ocean_fleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vessels to be added");
        int input = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        VesselUtilClass v = new VesselUtilClass();
        for (int i = 0; i < input; i++) {
            // enter vessel details
            String s = sc.nextLine();
            String[] str = s.split(":");
            Vessel v1 = new Vessel(str[0], str[1], Double.parseDouble(str[2]), str[3]);
            v.addVesselPerformance(v1);
        }
        System.out.println("Enter the Vessel Id to check speed");
        String vesselId = sc.nextLine();

        Vessel detail = v.getVesselById(vesselId);
        if (detail == null) {
            System.out.println("Vessel Id " + vesselId + " not found");
        } else {

            System.out.println(
                    detail.getVesselId() + " | " + detail.getVesselName() + " | " +
                            detail.getVesselType() + " | " + detail.getAverageSpeed() + " knots"
            );
        }

        //  High performance vessels
        System.out.println("High performance vessels are");

        List<Vessel> highPerformance = v.getHighPerformanceVessels();
        for (Vessel i : highPerformance) {
            System.out.println(
                    i.getVesselId() + " | " + i.getVesselName() + " | " +
                            i.getVesselType() + " | " + i.getAverageSpeed() + " knots"
            );
        }

        sc.close();
    }
}
