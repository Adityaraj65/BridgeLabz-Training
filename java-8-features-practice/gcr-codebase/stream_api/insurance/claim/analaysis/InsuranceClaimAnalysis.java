package stream_api.insurance.claim.analaysis;

import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        // Creating claim objects
        List<Claim> claims = new ArrayList<>();

        claims.add(new Claim("Health", 50000));
        claims.add(new Claim("Vehicle", 20000));
        claims.add(new Claim("Health", 30000));
        claims.add(new Claim("Property", 80000));
        claims.add(new Claim("Vehicle", 25000));
        claims.add(new Claim("Health", 40000));

        // Group claims by claim type and calculate average amount
        // grouping claims by type
        // calculating average claim amount
        Map<String, Double> averageClaimAmount =
                claims.stream().collect(Collectors.groupingBy(
                                Claim::getClaimType, Collectors.averagingDouble(Claim::getClaimAmount)));

        // Printing result
        averageClaimAmount.forEach((type, avgAmount) ->
                System.out.println("Claim Type: " + type + " | Average Amount: " + avgAmount)
        );
    }
}

